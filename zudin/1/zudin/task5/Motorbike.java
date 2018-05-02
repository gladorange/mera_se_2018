package zudin.task5;

public class Motorbike implements Vehicle {

    protected String curretnLocation;

    Motorbike(String curretnLocation) {
        this.curretnLocation = curretnLocation;
    }

    @Override
    public void moveTo(String newLocation) {

        System.out.printf("Еду из %s в %s. \n", curretnLocation, newLocation);
        curretnLocation = newLocation;

    }

}
