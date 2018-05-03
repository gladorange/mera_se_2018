package anoshkin.home5;

public abstract class CargoShip extends Ship implements CargoVehicle{
    protected Integer capacity  =0;
    protected String cargo = "";

    protected CargoShip(Integer draft, Integer capacity) {
        super(draft);
        this.capacity = capacity;
    }

    @Override
    public boolean loadCargo(String cargo) {
        this.cargo = cargo;
        return true;
    }

    @Override
    public boolean moveTo(String newLocation) {
        boolean result = super.moveTo(newLocation);
        if (result && ! cargo.equals("")){
            System.out.println("Delivered " + this.cargo + " to " + super.currentLocation);
            cargo = "";
        }
        return result;
    }

    @Override
    public Integer getMaxWeight() {
        return capacity;
    }
}
