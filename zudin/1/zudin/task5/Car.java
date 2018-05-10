package zudin.task5;

public abstract class Car implements Vehicle {

    protected int fuelConsumption;
    protected String curretnLocation;

    Car(String curretnLocation) {
        this.curretnLocation = curretnLocation;

    }

    @Override
    public void moveTo(String newLocation) {

        System.out.printf("Еду из %s в %s. \n", curretnLocation, newLocation);
        curretnLocation = newLocation;

    }
}
