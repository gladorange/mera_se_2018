package telukhin.task1.Machines;

import telukhin.task1.Abstract.CargoCar;
import telukhin.task1.Interfaces.CargoVehicle;

public class Truck implements CargoVehicle {
    private String currentLocation;
    private String cargo;
    private int carrying;

    public Truck(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public void moveTo(String newLocation) {
        System.out.println(String.format("Грузовой автомобиль. Еду из %s в %s ", currentLocation, newLocation));
        currentLocation = newLocation;
        if(cargo != null){
            System.out.printf("Доставил %s в %s", cargo, currentLocation);
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
