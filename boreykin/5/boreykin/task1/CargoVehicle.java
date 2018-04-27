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
public interface CargoVehicle extends Vehicle
{
    public boolean loadCargo(String cargo);
    public float getMaxWeight();
}
