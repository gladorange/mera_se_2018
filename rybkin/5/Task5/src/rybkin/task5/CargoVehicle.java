package rybkin.task5;

public interface CargoVehicle extends Vehicle {
    boolean loadCargo(String cargo);
    Integer getMaxWeight();
}
