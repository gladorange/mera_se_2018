package zudin.task5;

public abstract class Ship implements Vehicle {

    protected int draft;
    protected String curretnLocation;

    Ship(String curretnLocation) {
        this.curretnLocation = curretnLocation;

    }

    @Override
    public void moveTo(String newLocation) {

        System.out.printf("Плыву из %s в %s. \n", curretnLocation, newLocation);
        curretnLocation = newLocation;

    }

}
