package los.task1;

public abstract class Ship implements Vehicle
{
    public static final double defaultDraft = 2.0d;
    public static final String defaultLocation = "Location is not known";

    private double draft;
    private String currentLocation;

    public Ship()
    {
        this(defaultDraft,defaultLocation);
    }

    public Ship(double draft, String location)
    {
        this.draft = (draft > 0) ? draft : defaultDraft;
        currentLocation = ("".equals(location)) ? defaultLocation : location;
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
            currentLocation = destination;
            return true;
        }

        return false;
    }

    public String getLocation()
    {
        return currentLocation;
    }

    public double getDraft()
    {
        return draft;
    }

    public void setDraft(double draft)
    {
        this.draft = draft;
    }
}