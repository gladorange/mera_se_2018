package src;

public class Truck extends CargoCar implements CargoVehicle {

    public Truck(String location, int maxWeight, int consumption) {
        this.currentLocation = location;
        this.maxWeight = maxWeight;
        this.consumption = consumption;
    }

    @Override
    public void moveTo(String location) {
        System.out.println(String.format("Там далеко-далекоооо есть земля.. А я еду из %s в %s", currentLocation, location));
        this.currentLocation = location;
        if (!cargo.isEmpty()) {
            System.out.println(String.format("Доставил %s в %s", cargo, location));
            cargo = "";
        }
    }

    @Override
    public void loadCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public int getMaxWeight() {
        return this.maxWeight;
    }
}
