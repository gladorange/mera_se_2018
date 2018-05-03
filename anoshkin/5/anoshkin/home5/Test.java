package anoshkin.home5;

public class Test {
    public static void main(String[] args) {

        final int num = 10;
        int choise;
        Vehicle[] vehicles = new Vehicle[num];

        for (int i=0;i<num;i++) {
            choise = (int)(Math.random() * 10)%4;
            switch (choise){
                case 0:
                    vehicles[i] = new Motorbyke((float)3.5);
                    break;
                case 1:
                    vehicles[i] = new Truck((float)11.5, 200);
                    break;
                case 2:
                    vehicles[i] = new Yacht(15);
                    break;
                case 3:
                    vehicles[i] = new Barge(15, 1000);
                    break;
            }
            vehicles[i].moveTo("Liberty City");
        }

        for (int i = 0; i<num; i++){
            if(vehicles[i] instanceof CargoVehicle){
                ((CargoVehicle)vehicles[i]).loadCargo("Very Important Stuff");
            }
            vehicles[i].moveTo("Los Santos");
        }
    }
}
