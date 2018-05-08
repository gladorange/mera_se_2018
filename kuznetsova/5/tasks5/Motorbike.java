package tasks5;

public class Motorbike implements Vehicle {
    protected String currentLocation;

    public Motorbike(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public void moveTo(String newLocation) {
        System.out.println(String.format("Eду %s из %s ",newLocation,currentLocation));
        currentLocation = newLocation;
    }
}
