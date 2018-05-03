package src;

public class Yacht extends Ship {

    public Yacht(String location) {
        this.currentLocation = location;
    }

    @Override
    public void moveTo(String location) {
        System.out.println(String.format("Я яхта, и вовсе не медведь. Я плыву из %s в %s", currentLocation, location));
    }
}
