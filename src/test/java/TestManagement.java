import b060.*;
import com.tngtech.jgiven.junit5.ScenarioTest;
import jgiven.GivenHelicopter;
import jgiven.ThenHelicopter;
import jgiven.WhenHelicopter;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestManagement extends ScenarioTest<GivenHelicopter, WhenHelicopter, ThenHelicopter> {

    @BeforeEach
    public void setUp() {

    }

    @Test
    @Order(1)
    //Testing if there are indeed 4 Rooms, two on the left and two on the right side of the hallway
    public void testRoomLocationAndAmount() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(2)
    //Testing if there are indeed four blades on the helicopter
    public void testBladesAmountOnHelicopter() {
        try {
            for (int i = 0; i < 4; i++) {
                RotorBladeMediator[] blades = blades[i].getRotorBladeMediator();
                assertEquals(4, blades.length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Order(3)
    //Testing if the command design pattern works correctly
    public void testCommand() {
        given().;
        when().;
        then().;
    }

    @Test
    @Order(4)
    //Testing if the mediator design pattern works correctly
    public void testMediator() {
        given().createHelicopter();
        when().createMediator();
        then().assertIteratorHasTwoElements();
    }

}
