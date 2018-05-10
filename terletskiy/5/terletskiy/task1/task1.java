package terletskiy.task1;

import java.util.ArrayList;
import java.util.Random;

public class task1 {
    private static Random RandomStuffId = new Random();
    public static void main(String[] args) {
        //Создать парк транспортных средств (в массиве) - как инимум один экземпляр каждого транспортного средства.
        ArrayList<IVehicle> vehicles = new ArrayList<>();
        String startLocation = "StartCity";
        vehicles.add(new Motorbike(startLocation));
        vehicles.add(new Truck(startLocation));
        vehicles.add(new Yacht(startLocation));
        vehicles.add(new Barge(startLocation));

        //Направить все ТС в какой-то город.
        System.out.println("*** Направить все ТС в какой-то город. ***");
        for (IVehicle vehicle: vehicles) {
            vehicle.moveTo("city");
        }

        //Направить все грузовые ТС в другой город без груза.
        System.out.println("*** Направить все грузовые ТС в другой город без груза. ***");

        for (IVehicle vehicle: vehicles) {
            if (vehicle instanceof ICargoVehicle)
            {
                ICargoVehicle cargoCar = ((ICargoVehicle)vehicle);
                cargoCar.clearStuff();
                cargoCar.moveTo("cityForCargoCar");
            }
        }

        //Загрузить грузовые ТС чем-нибудь
        System.out.println("*** Загрузить грузовые ТС чем-нибудь ***");
        for (IVehicle vehicle: vehicles) {
            if (vehicle instanceof ICargoVehicle)
            {
                ICargoVehicle cargoVehicle = ((ICargoVehicle)vehicle);
                cargoVehicle.loadCargo("stuff " + RandomStuffId.nextInt());
            }
        }

        //Вернуть их обратно в город.
        System.out.println("*** Вернуть их обратно в город. ***");
        for (IVehicle vehicle: vehicles) {
            vehicle.moveHomeCity();
        }
    }
}