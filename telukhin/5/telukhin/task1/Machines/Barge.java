package telukhin.task1.Machines;

import telukhin.task1.Abstract.CargoShip;
import telukhin.task1.Interfaces.CargoVehicle;

public class Barge extends CargoShip{

    private String cargo;

    public Barge(String currentLocation) {
        super(currentLocation);
    }

    @Override
    public void moveTo(String newLocation) {
        System.out.println(String.format("Баржа. Плыву из %s в %s", currentLocation, newLocation));
        currentLocation = newLocation;if (cargo != null) {
            System.out.println(String.format("Доставил %s в %s", cargo, newLocation));
            cargo = null;
        }
    }

    @Override
    public void loadCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public int getMaxWeight() {
        return 0;
    }
}
