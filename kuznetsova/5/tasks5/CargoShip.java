package tasks5;

public abstract class CargoShip extends Ship implements CargoVehicle {
    protected int getMaxWeight;

    public CargoShip(String currentLocation) {
        super(currentLocation);
    }
}
