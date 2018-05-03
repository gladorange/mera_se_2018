package anoshkin.home5;

public abstract class CargoCar extends Car implements CargoVehicle {
    protected Integer capacity = 0;
    protected String cargo = "";

    protected CargoCar(Float fuelConsumption, Integer capacity) {
        super(fuelConsumption);
        this.capacity = capacity;
    }

    @Override
    public Integer getMaxWeight() {
        return capacity;
    }

    @Override
    public boolean loadCargo(String cargo){
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
}
