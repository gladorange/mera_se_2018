package telukhin;

import telukhin.task1.Interfaces.CargoVehicle;
import telukhin.task1.Interfaces.Vehicle;
import telukhin.task1.Machines.Barge;
import telukhin.task1.Machines.Motorbike;
import telukhin.task1.Machines.Truck;
import telukhin.task1.Machines.Yacht;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vechicles = new ArrayList<>();

        vechicles.add(new Motorbike("Самара"));
        vechicles.add(new Truck("Ростов"));
        vechicles.add(new Yacht("Владимир"));
        vechicles.add(new Barge("Новгород"));

        for (Vehicle v : vechicles) {
            v.moveTo("Москва");
        }
        System.out.println();

        for (Vehicle v : vechicles) {
            if (v instanceof CargoVehicle) {
                v.moveTo("Саратов");
                ((CargoVehicle) v).loadCargo("Гвозди");
                v.moveTo("Москва");
            }

        }

    }
}
