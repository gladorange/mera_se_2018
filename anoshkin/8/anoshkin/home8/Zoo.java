package anoshkin.home8;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static List<Cat> cats = new ArrayList<Cat>();
    public static List<Dog> dogs = new ArrayList<Dog>();
    public static List<Zebra> zebros = new ArrayList<Zebra>();
    public static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        AnimalReader ar = new AnimalReader();
        while(ar.readNextAnimal(animals, cats, dogs, zebros)){
        }
        AnimalTalker.sayHello(animals);
    }
}
