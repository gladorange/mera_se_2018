package telukhin.task1.Machines;

import telukhin.task1.Abstract.CargoShip;

public class Barge extends CargoShip {


    public Barge(String currentLocation) {
        super(currentLocation);
        draft = 100;
    }

    @Override
    public void moveTo(String newLocation) {
        System.out.println(String.format("Грузовое судно. Плыву из %s в %s ", currentLocation, newLocation));
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
        return draft;
    }
}
