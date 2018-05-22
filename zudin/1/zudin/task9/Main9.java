package zudin.task9;

import java.io.IOException;
import java.util.ArrayList;

public class Main9 {
    public static void main(String[] args) {

    ArrayList cats = new ArrayList<>();
    ArrayList dogs = new ArrayList<>();
    ArrayList zebras = new ArrayList<>();

    cats.add(new Cat("Барсик", 7));
    cats.add(new Cat("Васька", 9));
    cats.add((new Cat("Мурзик", 3)));

    dogs.add(new Dog("Бобик", "Loud"));
    dogs.add(new Dog("Тузик", "Silent"));
    dogs.add(new Dog("Бим", "Medium"));

    zebras.add(new Zebra("Лошадь", 23));
    zebras.add(new Zebra("Зебра", 77));
    zebras.add(new Zebra("theBra", 13));

        try {
            new CatWriter().writeAll(cats);
            new DogWriter().writeAll(dogs);
            new ZebraWriter().writeAll(zebras);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


