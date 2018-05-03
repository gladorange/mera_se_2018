package zudin.task5;

public abstract class CargoCar extends Car implements CargoVehicle {

    protected int carrying;
    protected String cargo = null;

    CargoCar(String curretnLocation) {
        super(curretnLocation);

    }
}
