package telukhin.task1.Machines;

import telukhin.task1.Interfaces.Vehicle;

public class Motorbike implements Vehicle {
    private String currentLocation;

    public Motorbike(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public void moveTo(String newLocation) {
        System.out.println(String.format("Мотоцикл. Eду из %s в %s ", currentLocation, newLocation));
        currentLocation = newLocation;
    }
}
