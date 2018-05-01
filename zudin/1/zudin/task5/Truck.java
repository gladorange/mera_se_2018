package zudin.task5;

public class Truck implements CargoVehicle {

    protected String curretnLocation;
    protected String cargo = null;
    protected int carrying;

    Truck(String curretnLocation) {
        this.curretnLocation = curretnLocation;
    }

    @Override
    public void moveTo(String newLocation) {
        System.out.printf("Еду из %s в %s. \n", curretnLocation, newLocation);
        curretnLocation = newLocation;
        if (cargo != null) {
            System.out.printf("Доставил %s в %s. \n", cargo, curretnLocation);
            cargo = null;

        }

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
