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
public class ExcersizeVehicles 
{
    public static void main(String [] args)
    {
        Vehicle [] vehicles =
        {
            new Motorbike("Москва"),
            new Motorbike("Мурманск"),
            new Truck("Москва","",8),
            new Truck("Вологда","",10),
            new Yacht(3,"Таллин"),
            new Yacht(4,"Рига"),
            new Barge(6, 20000,"Хельсинки",""),
            new Barge(7, 30000,"Стокгольм","")
        };
        
        for (Vehicle v:vehicles)
        {
            v.moveTo("Санкт-Петербург");
        }
        
        for(Vehicle v:vehicles)
        {
            if(CargoVehicle.class.isInstance(v))
            {
                v.moveTo("Амстердам");
                ((CargoVehicle)v).loadCargo("Ништяки");
            }
        }
        
        for(Vehicle v:vehicles)
        {
            v.moveTo("Санкт-Петербург");
        }
    }
}
