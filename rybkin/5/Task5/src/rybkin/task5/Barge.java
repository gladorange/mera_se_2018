package rybkin.task5;

public class Barge extends CargoShip implements CargoVehicle {
    protected String location = "doc2";
    protected Integer maxWeight = 2222222;
    protected String cargo = "Уголь";

    public boolean loadCargo (String cargo){
        this.cargo=cargo;
        return true;
    }

    @Override
    public Integer getMaxWeight() {
        return maxWeight;
    }


    @Override
    public boolean moveTo(String newLocation) {
        boolean result = super.moveTo(newLocation);
        if (result && ! cargo.equals("")){
            System.out.println("Доставил " + this.cargo + " в " + newLocation);
            cargo = "";
            this.location = newLocation;
        }
        return result;
    }
    Barge(String location){
        this.location=location;
    }
}
