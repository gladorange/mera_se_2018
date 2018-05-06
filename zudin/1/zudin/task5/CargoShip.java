package zudin.task5;

public abstract class CargoShip extends Ship implements CargoVehicle {

    protected int carrying;
    protected String cargo = null;

    CargoShip(String curretnLocation) {
        super(curretnLocation);

    }

    @Override
    public void moveTo(String newLocation) {
        System.out.printf("Плыву из %s в %s. \n", curretnLocation, newLocation);
        curretnLocation = newLocation;
        if (cargo != null) {
            System.out.printf("Доставил %s в %s", cargo, curretnLocation);
            cargo = null;

        }

    }

}
