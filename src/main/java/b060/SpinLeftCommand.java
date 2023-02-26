package b060;

public class SpinLeftCommand implements ICommand {
    private final IRotorBladeMediator mediator;

    public SpinLeftCommand(IRotorBladeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute(){
        mediator.controlBlades(Controll.DECREASE);
    }
}
