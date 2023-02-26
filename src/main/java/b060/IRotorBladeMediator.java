package b060;

import b060.Actuator;

public interface IRotorBladeMediator {
    void controlBlades();
    void registerblade1(Actuator blade);
    void registerblade2(Actuator blade);
    void registerblade3(Actuator blade);
    void registerblade4(Actuator blade);
}
