package terletskiy.task1;

public abstract class Ship implements IVehicle{

    protected final String startLocation;
    protected String currentLocation;
    /**
     * осадка
     */
    public double Draft;

    public Ship(String startLocation) {
        this.startLocation = startLocation;
        this.currentLocation = startLocation;
    }
    @Override
    public void moveTo(String newLocation) {
        System.out.println(String.format("Плыву в %s из %s города", newLocation, currentLocation));
        currentLocation = newLocation;
    }

    @Override
    public void moveHomeCity() {
        if (currentLocation == startLocation)
        {
            System.out.println("Я и так дом. НИкуда плыть не надо");
            return;
        }
        System.out.println("Еду домой:" + startLocation);
        moveTo(startLocation);
    }
}
