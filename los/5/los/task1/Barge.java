package los.task1;

public class Barge extends CargoShip
{
    public static long bargeMaxId = 1;
    private long bargeId;

    public Barge()
    {
        this(CargoShip.defaultLocation, CargoShip.defaultDraft, CargoShip.defaultMaxWeight, CargoShip.defaultCargo);
    }

    public Barge(String location, double draft, double maximumWeight, String cargo)
    {
        super(draft,maximumWeight,location,cargo);
        bargeId = bargeMaxId;
        bargeMaxId++;
    }

    @Override
    public boolean moveTo(String location)
    {
        String cargo = this.viewCargo();
        String from = getLocation();
        if(! super.moveTo(location))
        {
            return false;
        }

        System.out.printf("Barge with id %d sailed from %s to %s.%n", bargeId, from, getLocation());

        if(!cargo.equals(CargoShip.defaultCargo))
        {
            System.out.printf("Barge brought %f tons of \"%s\" to %s.%n", getMaxWeight(), cargo, getLocation());
        }
        return true;
    }
}