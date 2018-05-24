package rybkin.task5;

public class Main {

    public static void main(String[] args) {
        Vehicle [] v =  {
                new Truck("Moskov"),
                new Motorbike("Pekin"),
                new Yacht ("Nizhniy Tagil"),
                new Barge ("Rostov")
        };
        for (Vehicle vehicle: v){
            vehicle.moveTo("USA");
        }
        for (Vehicle vehicle: v){
            if (vehicle instanceof CargoVehicle) {
                vehicle.moveTo("Omsk");
                ((CargoVehicle)vehicle).loadCargo("Something");
                vehicle.moveTo("USA");
            }
        }
    }
}
