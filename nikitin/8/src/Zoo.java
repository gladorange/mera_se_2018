package src;

import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.LinkedList;

public class Zoo {
    private Collection<Cat> cats = new LinkedList<>();
    private Collection<Dog> dogs = new LinkedList<>();
    private Collection<Zebra> zebras = new LinkedList<>();

    private Collection<Animal> animals = new LinkedList<>();


    public Zoo() throws Throwable {
        try {
            AnimalReader reader = new AnimalReader("zoo.txt");
            while(reader.readNextAnimal(cats, dogs, zebras, animals)) {
                //nothing to do
            }

            AnimalTalker talker = new AnimalTalker();
            talker.sayHelloAll(cats);
            talker.sayHelloAll(dogs);
            talker.sayHelloAll(zebras);
            talker.sayHelloAll(animals);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws Throwable {
        Zoo zoo = new Zoo() ;
    }
}
