package los.task1;

public class Motorbike implements Vehicle
{
    public static final String defaultLocation = "Location is not known";
    public static long bikeMaxId = 1;

    private String currentLocation;
    private long bikeId;

    public Motorbike()
    {
        this(defaultLocation);
    }

    public Motorbike(String location)
    {
        bikeId = bikeMaxId;
        bikeMaxId++;
        if( ! location.equals(currentLocation) )
        {
            currentLocation = ("".equals(location)) ? defaultLocation : location;
        }
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
            System.out.printf("Motorbike with id %d leaved from %s and moved to %s.%n", bikeId, currentLocation, destination);
            currentLocation = destination;
            return true;
        }

        return false;
    }

    public String getCurrentLocation()
    {
        return currentLocation;
    }
}