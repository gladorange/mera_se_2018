package zudin.task5;

public class Truck extends CargoCar {

    protected String curretnLocation;
    protected String cargo = null;
    protected int carrying;

    Truck(String curretnLocation) {
        super(curretnLocation);
        this.curretnLocation = curretnLocation;
    }

    @Override
    public void loadCargo(String cargo) {
        this.cargo = cargo;

    }

    @Override
    public int getMaxWeight() {
        return this.carrying;

    }

}
