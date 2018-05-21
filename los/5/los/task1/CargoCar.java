package los.task1;

public abstract class CargoCar extends Car implements CargoVehicle
{
    public static final double defaultMaxWeight = 6.0f;
    private double maximumCarryingCapacity;

    public CargoCar()
    {
        this(Car.defaultFuelConsumption, defaultMaxWeight);
    }

    public CargoCar(double fuelConsumption, double maximumCarryingCapacity)
    {
        super(fuelConsumption);
        this.maximumCarryingCapacity = (maximumCarryingCapacity > 0) ? maximumCarryingCapacity : defaultMaxWeight;
    }

    @Override
    public double getMaxWeight()
    {
        return maximumCarryingCapacity;
    }
}
