package los.task1;

public interface CargoVehicle extends Vehicle
{
    public boolean loadCargo(String cargo);
    public double getMaxWeight();
}