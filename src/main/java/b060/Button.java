package b060;

public class Button {
    private ICommand command;

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void turnLeft(){
        command.execute();
    }

    public void turnRight(){
        command.execute();
    }
}
