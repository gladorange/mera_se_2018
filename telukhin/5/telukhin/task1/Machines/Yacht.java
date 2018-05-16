package telukhin.task1.Machines;

import telukhin.task1.Abstract.Ship;

public class Yacht extends Ship {

    public Yacht(String currentLocation) {
        super(currentLocation);
    }

    @Override
    public void moveTo(String newLocation) {
        super.moveTo(newLocation);
        /*System.out.println(String.format("Яхта. Плыву из %s в %s", currentLocation, newLocation));
        currentLocation = newLocation;*/
    }
}
