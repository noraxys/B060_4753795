package b060;

public class Application {
    public static void main(String[] args) {
        IRotorBladeMediator rotorBladeMediator = new RotorBladeMediator();

        SpinLeftCommand spinLeft = new SpinLeftCommand((ICommand) rotorBladeMediator);

        SpinRightCommand spinRight = new SpinRightCommand((ICommand) rotorBladeMediator);

        spinLeft.execute();
        spinRight.execute();
    }
}
