package rybkin.task5;

public class Truck extends CargoCar implements CargoVehicle{
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

    Truck(String location){
        this.location=location;
    }

    @Override
    public boolean loadCargo(String cargo) {
        return false;
    }

    @Override
    public Integer getMaxWeight() {
        return null;
    }
}
