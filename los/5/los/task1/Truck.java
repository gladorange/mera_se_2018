package los.task1;

public class Truck implements CargoVehicle
{
    private static long maxId = 3000;
    public static final String defaultLocation = "Location is not known";
    public static final String defaultCargo = "Not known";
    public static final double defaultMaxWeight = 5.0f;

    private long id;
    private String currentLocation;
    private String currentCargo;
    private double maximumCarryingCapacity;

    public Truck()
    {
        this(defaultLocation, defaultCargo, defaultMaxWeight);
    }

    public Truck(String location, String cargo, double maximumCarryingCapacity)
    {
        currentLocation = ("".equals(location)) ? defaultLocation : location;
        currentCargo = ("".equals(cargo)) ? defaultCargo : cargo;
        this.maximumCarryingCapacity = (maximumCarryingCapacity != 0) ? maximumCarryingCapacity : defaultMaxWeight;
        id = maxId;
        maxId++;
    }

    @Override
    public boolean loadCargo(String cargo)
    {
        if(currentCargo.equals(defaultCargo)
                && (!("".equals(cargo))
                && (!(defaultCargo.equals(cargo)))))
        {
            currentCargo = cargo;
            return true;
        }

        return false;
    }

    @Override
    public double getMaxWeight()
    {
        return maximumCarryingCapacity;
    }

    @Override
    public boolean moveTo(String location)
    {
        String destination = location;
        if("".equals(destination))
        {
            destination = defaultLocation;
        }

        if(!destination.equals(currentLocation))
        {
            System.out.printf("Truck with id %d leaved from %s and moved to %s.%n", id, currentLocation, destination);
            currentLocation = destination;

            if(!currentCargo.equals(defaultCargo))
            {
                System.out.printf("Truck  carried %f tons of \"%s\" to %s.%n", maximumCarryingCapacity, currentCargo, currentLocation);
                currentCargo = defaultCargo;
            }
            return true;
        }
        return false;
    }

    public String getCurrentLocation()
    {
        return currentLocation;
    }

    public String getCargo()
    {
        return currentCargo;
    }
}
