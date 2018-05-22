package los.task1;

public class Yacht extends Ship
{
    private static long yachtMaxId = 2;
    private long yachtId;

    Yacht()
    {
        this(Ship.defaultLocation, Ship.defaultDraft);
    }

    public Yacht(String location, double draft)
    {
        super(draft,location);
        yachtId = yachtMaxId;
        yachtMaxId++;
    }

    @Override
    public boolean moveTo(String location)
    {
        String from = this.getLocation();
        if(super.moveTo(location))
        {
            System.out.printf("Yacht with id %d sailed from %s to %s.%n", yachtId, from, getLocation());
            return true;
        }
        return false;
    }
}
