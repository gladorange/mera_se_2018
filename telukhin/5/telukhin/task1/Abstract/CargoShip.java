package telukhin.task1.Abstract;

import telukhin.task1.Interfaces.CargoVehicle;

public abstract class CargoShip extends Ship implements CargoVehicle {
    protected int carrying;

    public CargoShip(String currentLocation) {
        super(currentLocation);
    }
}
