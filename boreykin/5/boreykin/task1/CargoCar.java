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
public abstract class CargoCar extends Car implements CargoVehicle 
{
    public static final float DEFAULT_MAX_WEIGHT = 3.5f;
    private float maxLoad;
    
    public CargoCar()
    {
        this(Car.DEFAULT_FUEL_CONSUMPTION, DEFAULT_MAX_WEIGHT);
    }
    
    public CargoCar(float fuelConsumption, float maxLoad)
    {
        super(fuelConsumption);
        this.maxLoad = (maxLoad > 0) ? maxLoad : DEFAULT_MAX_WEIGHT;
    }
    
    @Override
    public float getMaxWeight()
    {
        return maxLoad;
    }
}
