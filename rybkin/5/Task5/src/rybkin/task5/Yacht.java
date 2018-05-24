package rybkin.task5;

public class Yacht extends Ship {
    protected String location = "pirs";

    public boolean moveTo (String newLocation){
        System.out.println("Плыву из " + location + "в " + newLocation);
        this.location = newLocation;
        return true;
    }
    Yacht(String location){
        this.location=location;
    }
}
