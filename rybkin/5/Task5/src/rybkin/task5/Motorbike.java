package rybkin.task5;

public abstract class Motorbike implements Vehicle {
    protected String location = "garage";

    public boolean moveTo (String newLocation){
        System.out.println("Еду из " + location + "в " + newLocation);
        this.location = newLocation;
        return true;
    }
}
