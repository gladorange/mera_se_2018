package anoshkin.home9;

import anoshkin.home8.Cat;
import anoshkin.home8.Dog;
import anoshkin.home8.Zebra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Zebra> zebras = new ArrayList<>();
        cats.add(new Cat("Barsik", 15));
        cats.add(new Cat("Murka", 5));
        dogs.add(new Dog("Sharik", 7));
        dogs.add(new Dog("Barbos", 8));
        zebras.add(new Zebra("Martin", 55));
        try {
            new CatWriter().writeAll(cats);
            new DogWriter().writeAll(dogs);
            new ZebraWriter().writeAll(zebras);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
