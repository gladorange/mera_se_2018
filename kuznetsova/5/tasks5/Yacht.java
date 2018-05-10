package tasks5;

public class Yacht extends Ship {

    public Yacht(String currentLocation) {
        super(currentLocation);
    }

    @Override
    public void moveTo(String newLocation) {
        System.out.println(String.format("Eду %s из %s ",newLocation,currentLocation));
        currentLocation = newLocation;
    }
}
