package zudin.task8;

import java.io.IOException;

public class Main8 {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo();
        AnimalReader ar = new AnimalReader();

        try {
            ar.readNextAnimal(myZoo.animals, myZoo.cats, myZoo.dogs, myZoo.zebras);
        } catch (IOException e) {
            e.printStackTrace();
        }

        AnimalTalker at = new AnimalTalker();
        at.sayHelloAll(myZoo.animals);
    }
}
