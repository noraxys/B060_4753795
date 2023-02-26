package b060;

public class SpinLeftCommand implements ICommand {
    private IRotorBladeMediator rotorBladeMediator;

    public SpinLeftCommand(ICommand iCommand) {
        this.rotorBladeMediator = rotorBladeMediator;
    }

    @Override
    public void execute(){

    }
}
