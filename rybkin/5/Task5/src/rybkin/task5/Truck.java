package rybkin.task5;

public abstract class Truck extends CargoCar implements CargoVehicle{
    protected String location = "baza";
    protected String cargo = "кирпичи";

    @Override
    public boolean moveTo(String newLocation) {
        boolean result = super.moveTo(newLocation);
        if (result && !cargo.equals("")) {
            System.out.println("Доставил " + this.cargo + " в " + newLocation);
            cargo = "";
            this.location = newLocation;
        }
        return result;
    }
}
