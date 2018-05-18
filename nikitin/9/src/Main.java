package src;

import java.util.Collection;
import java.util.LinkedList;

public class Main {



    private static void fillCats(Collection<Cat> cats) {
        cats.add(new Cat("Барсик", 20));
        cats.add(new Cat("Ress", 17));
    }

    private static void fillDogs(Collection<Dog> dogs) {
        dogs.add(new Dog("Шарик", "None"));
        dogs.add(new Dog("Псина Сутулая", "Loud"));
    }

    private static void fillZebras(Collection<Zebra> zebras) {
        zebras.add(new Zebra("Марти", 100));
    }

    public static void main(String[] args) {
        Collection<Cat> cats = new LinkedList<>();
        Collection<Dog> dogs = new LinkedList<>();
        Collection<Zebra> zebras = new LinkedList<>();

        fillCats(cats);
        fillDogs(dogs);
        fillZebras(zebras);

        new CatWriter().writeAll(cats);
        new ZebraWriter().writeAll(zebras);
        new DogWriter().writeAll(dogs);
    }


}
