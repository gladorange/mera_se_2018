package src;

public class Park {
    Car[] cars = new Car[2];
    Ship[] ships = new Ship[2];

    public static void main(String[] args) {
        Park p = new Park();

        p.cars[0] = new Motorbike("Moscow", 1);
        p.cars[1] = new Truck("Riga", 50, 10);

        p.ships[0] = new Barge("Murmansk", 1000);
        p.ships[1] = new Yacht("Simferopol");

        for(Car car : p.cars) {
            if (car instanceof Motorbike) {
                car.moveTo("Amsterdam");
            }

            if (car instanceof Truck) {
                ((Truck) car).loadCargo("Kokainum");
                car.moveTo("Nalchik");
                car.moveTo("Tambov");
            }
        }

        for(Ship ship : p.ships) {
            if (ship instanceof Barge) {
                ((Barge) ship).loadCargo("oil");
                ship.moveTo("Vladivostok");
                ship.moveTo("Nalchik");
            }

            if (ship instanceof Yacht) {
                ship.moveTo("Sochi");
            }
        }
    }
}
