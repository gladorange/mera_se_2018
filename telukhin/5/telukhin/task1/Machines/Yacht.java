package telukhin.task1.Machines;

import telukhin.task1.Abstract.Ship;

public class Yacht extends Ship {
    private String currentLocation;

    public Yacht(String currentLocation) {
        super(currentLocation);
    }

    @Override
    public void moveTo(String newLocation) {
        System.out.println(String.format("Яхта. Плыву из %s в %s", currentLocation, newLocation));
        currentLocation = newLocation;
    }
}
