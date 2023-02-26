package b060;

public class Application {
    public static void main(String[] args) {
        RotorBladeMediator rotorBladeMediator = new RotorBladeMediator();

        rotorBladeMediator.registerRightCommand(new SpinRightCommand(rotorBladeMediator));
        rotorBladeMediator.registerLeftCommand(new SpinLeftCommand(rotorBladeMediator));

        Button button = new Button();
        button.setLeftCommand(rotorBladeMediator.leftCommand);
        button.setRightCommand(rotorBladeMediator.rightCommand);

        button.executeLeft();
        button.executeRight();

    }
}
