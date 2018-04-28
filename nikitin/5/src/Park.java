package src;


public class Park {
    Vehicle[] vehicles = new Vehicle[4];

    public static void main(String[] args) {
        Park p = new Park();

        p.vehicles[0] = new Motorbike("Moscow", 1);
        p.vehicles[1] = new Truck("Riga", 50, 10);
        p.vehicles[2] = new Barge("Murmansk", 1000);
        p.vehicles[3] = new Yacht("Simferopol");

        for(Vehicle v : p.vehicles) {
            if (v instanceof Motorbike) {
                v.moveTo("Amsterdam");
            }
            if (v instanceof Truck) {
                ((Truck) v).loadCargo("Kokainum");
                v.moveTo("Nalchik");
                v.moveTo("Tambov");
            }
            if (v instanceof Barge) {
                ((Barge) v).loadCargo("oil");
                v.moveTo("Vladivostok");
                v.moveTo("Nalchik");
            }
            if (v instanceof Yacht) {
                v.moveTo("Sochi");
            }
        }
    }
}
