package los.task1;

public abstract class CargoShip extends Ship implements CargoVehicle
{
    public static final double defaultMaxWeight = 3000f;
    public static final String defaultCargo = "Not known";

    private double maximumCarryingCapacity;
    private String currentCargo;

    public CargoShip()
    {
        this(Ship.defaultDraft, defaultMaxWeight, Ship.defaultLocation, defaultCargo);
    }

    public CargoShip(double draft, double maximumWeight, String location, String cargo)
    {
        super(draft,location);
        this.maximumCarryingCapacity = (maximumWeight > 0) ? maximumWeight: defaultMaxWeight;
        currentCargo = ("".equals(cargo)) ? defaultCargo : cargo;
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
    public boolean moveTo(String location)
    {
        if(super.moveTo(location))
        {
            currentCargo = defaultCargo;
            return true;
        }

        return false;
    }

    @Override
    public double getMaxWeight()
    {
        return maximumCarryingCapacity;
    }

    public String viewCargo()
    {
        return currentCargo;
    }
}