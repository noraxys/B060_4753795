package b060;

public class SpinRightCommand implements ICommand {
    private IRotorBladeMediator rotorBladeMediator;

    public SpinRightCommand(ICommand iCommand) {
        this.rotorBladeMediator = rotorBladeMediator;
    }

    @Override
    public void execute(){
    }
}
