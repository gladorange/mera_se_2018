package rybkin.task5;

public abstract class CargoShip extends Ship {
    protected Integer maxGp = 200000;
    protected String location = "doc3";

    public boolean moveTo (String newLocation){
        System.out.println("Плыву из " + location + "в " + newLocation);
        this.location = newLocation;
        return true;
    }
}
