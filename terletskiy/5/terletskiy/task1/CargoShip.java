package terletskiy.task1;

import java.util.ArrayList;

public abstract class CargoShip extends Ship implements ICargoVehicle{
    //- Создать абстрактный класс CargoShip имеющий поля максимальная грузоподъемность, наследник Ship

    public final int maxWeight;
    protected ArrayList<String> stuffs = new ArrayList<String>();

    protected CargoShip(String startLocation, int maxWeight) {
        super(startLocation);
        this.maxWeight = maxWeight;
    }

    @Override
    public void loadCargo(String cargo) {
        System.out.println(String.format("груз: %s загружен в Barge", cargo));
        stuffs.add(cargo);
    }

    @Override
    public void clearStuff() {
        stuffs.clear();
    }

    @Override
    public void moveTo(String newLocation) {
        if (stuffs.isEmpty()){
            super.moveTo(newLocation);
        } else {
            System.out.println(String.format("Перевожу груз в %s из %s города", newLocation, currentLocation));
        }
        Arrived(newLocation);
    }

    private void Arrived(String newLocation) {
        // Причем, если у ТС есть груз, то по прибытии в пункт назначения надо вывести
        // Доставил <название груза> в <место>". Груз после этого должен обнулится, местоположение тоже должно изменится.
        for (String stuff: stuffs) {
            System.out.println(String.format("Я Barge Доставил груз: %s в %s", stuff, newLocation));
        }
        clearStuff();
    }
}
