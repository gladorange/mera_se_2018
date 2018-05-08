package zudin.task5;

public class Barge extends CargoShip {

    Barge(String curretnLocation) {
        super(curretnLocation);
        draft = 200;
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
