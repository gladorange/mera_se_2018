package tasks5;

import java.util.ArrayList;

public class MainClass {

    public static void main (String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        for (autoPark a : autoPark.values()) {

            switch (a) {
                case MOTORBIKE:
                    vehicles.add(new Motorbike("New York"));
                    break;
                case TRUCK:
                    vehicles.add(new Truck("Paris"));
                    break;
                case YACHT:
                    vehicles.add(new Yacht("Moscow"));
                    break;
                case BARGE:
                    vehicles.add(new Barge("London"));
                    break;

            }

        }
        for (Vehicle v : vehicles) {
            v.moveTo("Peru");

        }
        for (Vehicle v : vehicles) {
            if (v instanceof CargoVehicle) {
                v.moveTo("China");
                ((CargoVehicle) v).loadCargo("tickets");
                v.moveTo("Peru");
            }

        }

    }
    }
