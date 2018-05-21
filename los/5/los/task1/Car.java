package los.task1;

public abstract class Car implements Vehicle
{
    public static final double defaultFuelConsumption = 10.0f;
    private double fuelConsumption;

    public Car()
    {
        this(defaultFuelConsumption);
    }

    public Car(double fuelConsumption)
    {
        this.fuelConsumption = (fuelConsumption > 0) ? fuelConsumption: defaultFuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}