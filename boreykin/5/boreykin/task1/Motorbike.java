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
public class Motorbike implements Vehicle
{
    public static final String DEFAULT_LOCATION = "Default city";
    public static int bikeMaxId = 1;
    
    private String currentLocation;
    private int bikeId;
    
    public Motorbike()
    {
        this(DEFAULT_LOCATION);
    }
    
    public Motorbike(String location)
    {
        bikeId = bikeMaxId;
        bikeMaxId++;
        if( ! location.equals(currentLocation) )
        {
            currentLocation = ("".equals(location)) ? DEFAULT_LOCATION : location;
        }
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
            System.out.printf("Мотоцикл %d приехал из %s в %s.%n", bikeId, currentLocation, destination);
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
