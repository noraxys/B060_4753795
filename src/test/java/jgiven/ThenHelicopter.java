package jgiven;

import b060.*;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

public class ThenHelicopter extends Stage<ThenHelicopter> {
    @ExpectedScenarioState
    public IRotorBladeMediator rotorBladeMediator;

    public ThenHelicopter assertMediatorHasTwoElements() {
        return self();
    }
}
