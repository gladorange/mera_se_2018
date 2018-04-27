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
public class Yacht extends Ship
{
    private static int yachtMaxId = 1;
    private int yachtId;
    
    Yacht()
    {
        this(Ship.DEFAULT_DRAFT,Ship.DEFAULT_LOCATION);
    }
    
    public Yacht(float draft, String location)
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
            System.out.printf("Яхта %d приплыла из %s в %s.%n", yachtId, from, getLocation());
            return true;
        }
        
        return false;
    }
}
