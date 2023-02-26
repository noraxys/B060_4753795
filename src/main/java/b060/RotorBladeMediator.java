package b060;

import java.util.ArrayList;

public class RotorBladeMediator implements IRotorBladeMediator {
    private ArrayList<Actuator> bladesList = new ArrayList<Actuator>();
    public ICommand leftCommand;
    public ICommand rightCommand;

    public RotorBladeMediator(){
        bladesList.add(new Actuator());
        bladesList.add(new Actuator());
        bladesList.add(new Actuator());
        bladesList.add(new Actuator());
    }

    public void registerRightCommand(ICommand command){
        this.rightCommand = command;
    };

    public void registerLeftCommand(ICommand command){
        this.leftCommand = command;
    };

    @Override
    public void controlBlades(Controll controll) {
        for (int i = 0; i <= 3; i++) {
            if(controll == Controll.DECREASE){
            bladesList.get(i).decreaseAngle();}

            if(controll == Controll.INCREASE){
                bladesList.get(i).increaseAngle();
            }
        }
    }
}
