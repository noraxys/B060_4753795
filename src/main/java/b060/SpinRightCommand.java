package b060;

public class SpinRightCommand implements ICommand {
    private final IRotorBladeMediator mediator;

    public SpinRightCommand(IRotorBladeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute(){
        mediator.controlBlades(Controll.INCREASE);
    }
}

