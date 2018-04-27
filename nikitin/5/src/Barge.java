package src;

public class Barge extends CargoShip implements CargoVehicle {

    public Barge(String location, int maxWeight) {
        this.currentLocation = location;
        this.maxWeight = maxWeight;
    }

    @Override
    public void moveTo(String location) {
        System.out.println(String.format("Йа баржа, нооовая бар-жа. Я плыву из %s в %s", currentLocation, location));
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
