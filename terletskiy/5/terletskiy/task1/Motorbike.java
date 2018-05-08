package terletskiy.task1;

public class Motorbike implements IVehicle {
    protected final String startLocation;
    private String currentLocation;

    public Motorbike(String startLocation) {
        this.startLocation = startLocation;
        this.currentLocation = startLocation;

    }

    @Override
    public void moveTo(String newLocation) {
        System.out.println(String.format("Мчу в %s из %s города", newLocation, currentLocation));
        currentLocation = newLocation;
    }

    @Override
    public void moveHomeCity() {
        if (currentLocation == startLocation)
        {
            System.out.println("Я и так дом. НИкуда ехать не надо");
            return;
        }
        System.out.println("Мчу домой:" + startLocation);
        moveTo(startLocation);
    }
}
