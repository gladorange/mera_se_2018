package src;

public class Motorbike extends Car implements Vehicle {

    public Motorbike(String location, int consumption) {
        this.currentLocation = location;
        this.consumption = consumption;
    }

    @Override
    public void moveTo(String location) {
        System.out.println(String.format("Вррррр, еду из %s в %s", currentLocation, location));
        this.currentLocation = location;
    }
}
