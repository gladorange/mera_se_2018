/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boreykin.task1;

/**
 *
 * @author flyer
 */
public abstract class CargoShip extends Ship implements CargoVehicle
{
    public static final float DEFAULT_MAX_WEIGHT = 1000f;
    public static final String DEFAULT_CARGO = "No cargo...";
    
    private float maxLoad;
    private String currentCargo;
    
    public CargoShip()
    {
        this(Ship.DEFAULT_DRAFT,DEFAULT_MAX_WEIGHT,Ship.DEFAULT_LOCATION, DEFAULT_CARGO);
    }
    
    public CargoShip(float draft, float maxWeight, String location, String cargo)
    {
        super(draft,location);
        this.maxLoad = (maxWeight > 0) ? maxWeight: DEFAULT_MAX_WEIGHT;
        currentCargo = ("".equals(cargo)) ? DEFAULT_CARGO : cargo;
    }
    
    @Override
    public boolean loadCargo(String cargo) 
    {
        if(currentCargo.equals(DEFAULT_CARGO)
        && (!("".equals(cargo))
        && (!(DEFAULT_CARGO.equals(cargo)))))
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
            currentCargo = DEFAULT_CARGO;
            return true;
        }
        
        return false;
    }

    @Override
    public float getMaxWeight()
    {
        return maxLoad;
    }
    
    public String viewCargo()
    {
        return currentCargo;
    }
}
