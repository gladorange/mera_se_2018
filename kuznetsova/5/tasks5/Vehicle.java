package tasks5;

interface Vehicle {
    void moveTo (String newLocation);
}

interface CargoVehicle extends Vehicle {
    void loadCargo(String cargo);
    int getMaxWeight();
}

enum autoPark {
    MOTORBIKE,TRUCK,YACHT,BARGE;
}