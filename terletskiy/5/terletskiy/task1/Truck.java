package terletskiy.task1;

public class Truck extends CargoCar {
    protected final String startLocation;
    private String currentLocation;
    public final int maxWeight;
    private static final int MAX_WEIGHT = 5;

    public Truck(String startLocation, int maxWeight) {
        this.startLocation = startLocation;
        this.currentLocation = currentLocation;
        this.maxWeight = maxWeight;
    }

    public Truck(String startLocation) {
        this.startLocation = startLocation;
        this.currentLocation = currentLocation;
        this.maxWeight = MAX_WEIGHT;
    }

    @Override
    public int getMaxWeight() {
        return this.maxWeight;
    }

    @Override
    public void moveTo(String newLocation) {
        if (stuffs.isEmpty()){
            System.out.println(String.format("Пустой еду в %s из %s города ", newLocation, currentLocation));
        } else{
            System.out.println(String.format("Перевожу груз в %s из %s города ", newLocation, currentLocation));
            Arrived(newLocation);
        }
    }

    @Override
    public void moveHomeCity() {
        if (currentLocation == startLocation)
        {
            System.out.println("Я и так дома");
            return;
        }
        System.out.println("Еду домой:" + startLocation);
        moveTo(startLocation);
    }

    private void Arrived(String newLocation) {
        // Причем, если у ТС есть груз, то по прибытии в пункт назначения надо вывести
        // Доставил <название груза> в <место>". Груз после этого должен обнулится, местоположение тоже должно изменится.
        for (String stuff: stuffs) {
            System.out.println(String.format("Я Трак Доставил %s в %s", stuff, newLocation));
        }
        clearStuff();
    }
}
