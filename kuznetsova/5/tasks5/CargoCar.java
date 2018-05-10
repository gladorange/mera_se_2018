package tasks5;

public abstract class CargoCar extends Car implements CargoVehicle {
    protected int maxCarrying;

    public CargoCar(int fuelConsumption, int maxCarrying) {
        super(fuelConsumption);
        this.maxCarrying = maxCarrying;
    }
}
