package rybkin.task5;

public abstract class Car implements Vehicle {
    protected String location = "garage";
    protected  Integer rashod = 1;

    public boolean moveTo (String newLocation){
        System.out.println("Еду из " + location + "в " + newLocation);
        this.location = newLocation;
        return true;
    }
}
