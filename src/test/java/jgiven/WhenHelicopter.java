package jgiven;

import b060.*;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

public class WhenHelicopter {
    @ExpectedScenarioState
    public IRotorBladeMediator rotorBladeMediator;

    public WhenHelicopter createMediator() {
        rotorBladeMediator = hallway.getLeftRooms()[0].rotorBladeMediator();
        return self();
    }
}
