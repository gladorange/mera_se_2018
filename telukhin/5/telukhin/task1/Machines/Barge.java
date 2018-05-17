package telukhin.task1.Machines;

import telukhin.task1.Abstract.CargoShip;
import telukhin.task1.Interfaces.CargoVehicle;

public class Barge extends CargoShip{


    public Barge(String currentLocation) {
        super(currentLocation);
    }

    @Override
    public void moveTo(String newLocation) {
        super.moveTo(newLocation);
    }

    @Override
    public void loadCargo(String cargo) {
        super.loadCargo(cargo);
    }

    @Override
    public int getMaxWeight() {
        return 0;
    }
}
