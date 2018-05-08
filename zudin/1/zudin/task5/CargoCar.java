package zudin.task5;

public abstract class CargoCar extends Car implements CargoVehicle {

    protected int carrying;
    protected String cargo = null;

    CargoCar(String curretnLocation) {
        super(curretnLocation);

    }

    @Override
    public void moveTo(String newLocation) {
        System.out.printf("Еду из %s в %s. \n", curretnLocation, newLocation);
        curretnLocation = newLocation;
        if (cargo != null) {
            System.out.printf("Доставил %s в %s. \n", cargo, curretnLocation);
            cargo = null;

        }

    }
}
