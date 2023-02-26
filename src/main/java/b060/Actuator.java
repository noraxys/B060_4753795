package b060;

public class Actuator implements IActuator {
    private int angle;
    private final int maxAngle = 15;
    private final int minAngle = -15;

    @Override
    public void increaseAngle() {
        if (this.angle != maxAngle) {
            this.angle = this.angle - 3;
        }
    }

    @Override
    public void decreaseAngle() {
        if (this.angle != minAngle) {
            this.angle = this.angle + 3;
        }
    }
}
