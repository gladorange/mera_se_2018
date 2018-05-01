package zudin.task5;

import java.util.ArrayList;

public class Main5 {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (AutoPark a : AutoPark.values()) {

            switch (a) {
            case MOTORBIKE:
                vehicles.add(new Motorbike("Москва"));
                break;
            case TRUCK:
                vehicles.add(new Truck("Кстово"));
                break;
            case YACHT:
                vehicles.add(new Yacht("Ростов"));
                break;
            case BARGE:
                vehicles.add(new Barge("Бор"));
                break;

            }

        }
        for (Vehicle v : vehicles) {
            v.moveTo("Нижний Новгород");

        }
        for (Vehicle v : vehicles) {
            if (v instanceof CargoVehicle) {
                v.moveTo("Казань");
                ((CargoVehicle) v).loadCargo("товары");
                v.moveTo("Нижний Новгород");
            }

        }

    }

}
