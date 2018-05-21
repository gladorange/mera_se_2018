package los.task1;

public class Main {
    public static void main(String args[])
    {
        Vehicle [] vehicles =
                {
                        new Barge("Petropavlovsk", 6, 20000, ""),
                        new Barge("Norilsk", 7, 30000,""),
                        new Motorbike("Tyumen"),
                        new Motorbike("Moscow"),
                        new Truck("Nizhny Novgorod","",8),
                        new Truck("Kostroma","",10),
                        new Yacht("Kirov", 3),
                        new Yacht("Sochi", 4)
                };

        // move all vehicles to a city
        for (Vehicle v:vehicles)
        {
            v.moveTo("Kazan");
        }

        // move all cargo vehicles to other city without cargo and load them
        for(Vehicle v:vehicles)
        {
            if(CargoVehicle.class.isInstance(v))
            {
                v.moveTo("Rostov-na-Donu");
                ((CargoVehicle)v).loadCargo("Foods");
            }
        }

        // come back cargo vehicles to the city
        for(Vehicle v:vehicles)
        {
            v.moveTo("Kazan");
        }
    }

}
