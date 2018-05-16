package telukhin.task1.Abstract;

import telukhin.task1.Interfaces.CargoVehicle;

public abstract class CargoShip extends Ship implements CargoVehicle {
    protected int carrying;
    protected String cargo;

    public CargoShip(String currentLocation) {
        super(currentLocation);
    }

    @Override
    public void loadCargo(String cargo) {
        this.cargo = cargo;
        System.out.println(String.format("Грузовой корабль. Забрал груз (%s)", cargo));
    }

    @Override
    public void moveTo(String newLocation) {
        System.out.println(String.format("Грузовой корабль. Плыву из %s в %s", currentLocation, newLocation));
        currentLocation = newLocation;
        if (cargo != null) {
            System.out.println(String.format("Грузовой корабль. Доставил %s в %s \n", cargo, newLocation));
            cargo = null;
        }
    }
}
