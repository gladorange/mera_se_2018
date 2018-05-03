package tasks5;

public abstract class Ship implements Vehicle {
    protected int draft;
    String currentLocation;

    public Ship(String currentLocation) {
        this.currentLocation = currentLocation;
    }

}
