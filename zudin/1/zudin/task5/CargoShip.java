package zudin.task5;

public abstract class CargoShip extends Ship implements CargoVehicle {

    protected int carrying;
    protected String cargo = null;

    CargoShip(String curretnLocation) {
        super(curretnLocation);

    }

}
