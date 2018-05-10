package anoshkin.home5;

public abstract class Car implements Vehicle{
    private Float fuelConsumption;
    protected String currentLocation = "Factory";
    protected String oldLocation = "Factory";

    protected Car(Float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Float getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public boolean moveTo(String newLocation) {
        System.out.printf("Driving from %s to %s\n", this.currentLocation, newLocation);
        this.oldLocation = this.currentLocation;
        this.currentLocation = newLocation;
        return true;
    }
}
