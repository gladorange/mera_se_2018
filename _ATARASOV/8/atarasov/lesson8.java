package atarasov;

import java.util.ArrayList;
import java.util.List;

public class lesson8 {

    public static class Living {

    }

    public static class Animal extends Living {
        String name;

        public Animal(String name) {
            this.name = name;
        }
    }

    public static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        public void meow() {
            System.out.println("meow!");
        }
    }

    public static class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }
    }


    public static void main(String[] args) {
        Class c1 = String.class;
        Class<Integer> iClass = Integer.class;

        List<Cat> cats = new ArrayList<>();
       cats.add(new Cat("Барсик"));
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Шарик"));

        sayName(dogs);
        sayName(cats);

        List<Living> animals = new ArrayList<>();
        animals.add(new Dog("Шарик"));
        animals.add(new Cat("Барсик"));

        addRandomAnimal(animals);

    }


    //PECS - producer - extends, consumer - super
    public static void sayName(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal.name);
        }
    }

    public static void addRandomAnimal(List<? super Animal> list) {
        list.add(new Cat("Котенок"));
        list.add(new Dog("Собочка"));
    }
}
