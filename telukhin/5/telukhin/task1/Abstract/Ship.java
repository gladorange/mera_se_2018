package telukhin.task1.Abstract;

import telukhin.task1.Interfaces.Vehicle;

public abstract class Ship implements Vehicle {
    protected int draft;

    String currentLocation;

    public Ship(String currentLocation) {
        this.currentLocation = currentLocation;
    }


}
