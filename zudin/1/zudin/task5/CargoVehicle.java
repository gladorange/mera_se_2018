package zudin.task5;

public interface CargoVehicle extends Vehicle {

    void loadCargo(String cargo);

    int getMaxWeight();
}
