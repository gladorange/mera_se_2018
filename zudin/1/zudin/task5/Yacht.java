package zudin.task5;

public class Yacht extends Ship {

    Yacht(String curretnLocation) {
        super(curretnLocation);
        draft = 100;

    }

    @Override
    public void moveTo(String newLocation) {

        System.out.printf("Плыву из %s в %s. \n", curretnLocation, newLocation);
        curretnLocation = newLocation;

    }

}
