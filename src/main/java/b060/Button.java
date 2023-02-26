package b060;

public class Button {
    private ICommand leftCommand;
    private ICommand rightCommand;

    public void setLeftCommand(ICommand command) {
        this.leftCommand = command;
    }

    public void setRightCommand(ICommand command) {
        this.rightCommand = command;
    }

    public void executeLeft (){
        leftCommand.execute();
    }

    public void executeRight(){
        rightCommand.execute();
    }
}
