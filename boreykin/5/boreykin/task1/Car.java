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
public abstract class Car implements Vehicle
{
    public static final float DEFAULT_FUEL_CONSUMPTION = 0.1f;
    private float fuelConsuption;
    
    public Car()
    {
        this(DEFAULT_FUEL_CONSUMPTION);
    }
    
    public Car(float fuelConsumption)
    {
        this.fuelConsuption = (fuelConsumption > 0) ? fuelConsumption: DEFAULT_FUEL_CONSUMPTION;
    }

    public float getFuelConsuption() {
        return fuelConsuption;
    }

    public void setFuelConsuption(float fuelConsuption) {
        this.fuelConsuption = fuelConsuption;
    }
}
