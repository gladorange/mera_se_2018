package telukhin.task1.Machines;

import telukhin.task1.Interfaces.CargoVehicle;

public class Truck implements CargoVehicle {
    private String currentLocation;
    private String cargo;

    public Truck(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public void loadCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public int getMaxWeight() {
        return 0;
    }

    @Override
    public void moveTo(String newLocation) {
        System.out.println(String.format("Грузовик. Eду из %s в %s ", currentLocation, newLocation));
        currentLocation = newLocation;
        if (cargo != null) {
            System.out.println(String.format("Доставил %s в %s", cargo, newLocation));
            cargo = null;
        }
    }
}

