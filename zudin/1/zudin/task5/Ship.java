package zudin.task5;

public abstract class Ship implements Vehicle {

    protected int draft;
    protected String curretnLocation;

    Ship(String curretnLocation) {
        this.curretnLocation = curretnLocation;

    }

}
