package zudin.task5;

public class Barge extends CargoShip {

    Barge(String curretnLocation) {
        super(curretnLocation);
        draft = 200;
    }

    @Override
    public void moveTo(String newLocation) {
        System.out.printf("Плыву из %s в %s. \n", curretnLocation, newLocation);
        curretnLocation = newLocation;
        if (cargo != null) {
            System.out.printf("Доставил %s в %s", cargo, curretnLocation);
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
