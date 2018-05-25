package rybkin.task5;

public abstract class Ship  implements Vehicle{
    protected Integer draft = 6;
    protected String location = "doc";

    public boolean moveTo (String newLocation){
        System.out.println("Плыву из " + location + "в " + newLocation);
        this.location = newLocation;
        return true;
    }
    }
