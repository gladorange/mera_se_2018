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
public class Barge extends CargoShip
{
    public static int bargeMaxId = 1;
    private int bargeId;
    
    public Barge()
    {
        this(CargoShip.DEFAULT_DRAFT, CargoShip.DEFAULT_MAX_WEIGHT, CargoShip.DEFAULT_LOCATION, CargoShip.DEFAULT_CARGO);
    }
    
    public Barge(float draft, float maxWeight, String location, String cargo)
    {
        super(draft,maxWeight,location,cargo);
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
        
        System.out.printf("Баржа %d приплыла из %s в %s.%n", bargeId, from, getLocation());
        
        if(!cargo.equals(CargoShip.DEFAULT_CARGO))
        {
            System.out.printf("В %s она привезла %.2f тонн(ы) груза \"%s\".%n", getLocation(), getMaxWeight(), cargo);
        }
        
        return true;
    }
}
