package anoshkin.home8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class AnimalReader {
    private static BufferedReader in;

    static {
        try {
            in = new BufferedReader(new FileReader(".\\anoshkin\\8\\zoo.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }
    }

    public boolean readNextAnimal(List<Animal> animals, List<Cat> cats, List<Dog> dogs, List<Zebra> zebras){
        try {
            String inString = in.readLine();
            if (inString != null) {
                String className = inString.split(" ")[0];
                String name = inString.split(" ")[1];
                String value = inString.split(" ")[2];

                if (className.equals("Cat")) {
                    Cat newCat = new Cat(name, Integer.parseInt(value));
                    cats.add(newCat);
                    animals.add(newCat);
                }
                if (className.equals("Dog")) {
                    Dog newDog = new Dog(name, Integer.parseInt(value));
                    dogs.add(newDog);
                    animals.add(newDog);
                }
                if (className.equals("Zebra")) {
                    Zebra newZ = new Zebra(name, Integer.parseInt(value));
                    zebras.add(newZ);
                    animals.add(newZ);
                }
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return false;
    }
}
