package atarasov.lesson4;

public class Zebra {

    enum ZebraMeal {
        GRASS("Трава"),
        FRUIT("Фрукты");

        String rusName;

        ZebraMeal(String rusName) {
            this.rusName = rusName;
        }

        @Override
        public String toString() {
            return rusName;
        }
    }

    String name;

    public String getName() {
        return name;
    }

    public void eatSomething(ZebraMeal meal) {
        System.out.println("*Зебра съела: " + meal);

    }

    public static void main(String[] args) {
        ZebraMeal meal = ZebraMeal.GRASS;
        System.out.println(meal);
        Zebra z = new Zebra();
        z.eatSomething(ZebraMeal.FRUIT);

        Zebra.ZebraMeal anotherVar = Zebra.ZebraMeal.FRUIT;
    }
}


