package telukhin.task1.Abstract;

import telukhin.task1.Interfaces.Vehicle;

public abstract class Ship implements Vehicle {
    protected int draft;
    protected String currentLocation;

    public Ship(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public void moveTo(String newLocation) {
        System.out.println(String.format("Пассажирский корабль. Плыву из %s в %s", currentLocation, newLocation));
        currentLocation = newLocation;
    }
}
