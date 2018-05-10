package anoshkin.home5;

public class Truck extends CargoCar {

    protected Truck(Float fuelConsumption, Integer capacity) {
        super(fuelConsumption, capacity);
    }

    @Override
    public Integer getMaxWeight() {
        return null;
    }
}
