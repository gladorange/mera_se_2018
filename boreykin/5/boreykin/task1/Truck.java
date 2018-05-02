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
public class Truck implements CargoVehicle
{
    private static int maxId = 1;
    public static final String DEFAULT_LOCATION = "Default city";
    public static final String DEFAULT_CARGO = "No cargo...";
    public static final float DEFAULT_MAX_WEIGHT = 3.5f;
    
    private int id;
    private String currentLocation;
    private String currentCargo;
    private float maxLoad;
    
    public Truck()
    {
        this(DEFAULT_LOCATION, DEFAULT_CARGO, DEFAULT_MAX_WEIGHT);
    }

    public Truck(String location, String cargo, float maxLoad)
    {
        currentLocation = ("".equals(location)) ? DEFAULT_LOCATION : location;
        currentCargo = ("".equals(cargo)) ? DEFAULT_CARGO : cargo;
        this.maxLoad = (maxLoad != 0) ? maxLoad : DEFAULT_MAX_WEIGHT;
        id = maxId;
        maxId++;
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
    public float getMaxWeight() 
    {
        return maxLoad;
    }

    @Override
    public boolean moveTo(String location) 
    {
        String destination = location;
        if("".equals(destination))
        {
            destination = DEFAULT_LOCATION;
        }
        
        if(!destination.equals(currentLocation))
        {
            System.out.printf("Грузовик %d приехал из %s в %s.%n", id, currentLocation, destination);
            currentLocation = destination;
            
            if(!currentCargo.equals(DEFAULT_CARGO))
            {
                System.out.printf("В %s им было привезено %.2f тонн(ы) груза \"%s\".%n", currentLocation, maxLoad, currentCargo);
                currentCargo = DEFAULT_CARGO;
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
