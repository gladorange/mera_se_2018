package telukhin.task1.Abstract;

import telukhin.task1.Interfaces.CargoVehicle;

public abstract class   CargoShip extends Ship implements CargoVehicle {
    protected int carrying;
    protected String cargo = null;

    public CargoShip(String currentLocation) {
        super(currentLocation);
    }
}
