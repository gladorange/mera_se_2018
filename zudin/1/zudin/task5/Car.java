package zudin.task5;

public abstract class Car implements Vehicle {

    protected int fuelConsumption;
    protected String curretnLocation;

    Car(String curretnLocation) {
        this.curretnLocation = curretnLocation;

    }
}
