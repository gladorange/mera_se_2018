package tasks5;

public class Truck implements CargoVehicle {
    protected String currentLocation;
    protected String cargo = null;
    protected int carrying;


    public Truck(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public void moveTo(String newLocation) {
        System.out.println(String.format("Eду %s из %s ",newLocation,currentLocation));
        currentLocation = newLocation;
        if (cargo != null) {
            System.out.println(String.format("Доставил %s в %s",cargo,currentLocation));
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