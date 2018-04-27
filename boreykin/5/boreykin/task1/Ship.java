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
public abstract class Ship implements Vehicle
{
    public static final float DEFAULT_DRAFT = 3.0f;
    public static final String DEFAULT_LOCATION = "Default city";
    
    private float draft;
    private String currentLocation;
    
    public Ship()
    {
        this(DEFAULT_DRAFT,DEFAULT_LOCATION);
    }
    
    public Ship(float draft, String location)
    {
        this.draft = (draft > 0) ? draft : DEFAULT_DRAFT;
        currentLocation = ("".equals(location)) ? DEFAULT_LOCATION : location;
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
            currentLocation = destination;
            return true;
        }
        
        return false;
    }
    
    public String getLocation()
    {
        return currentLocation;
    }

    public float getDraft() 
    {
        return draft;
    }

    public void setDraft(float draft) 
    {
        this.draft = draft;
    }
}
