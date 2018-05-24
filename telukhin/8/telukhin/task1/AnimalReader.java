package telukhin.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class AnimalReader {
    static void readNextAnimal(List<Animal> listAnimals,
                               List<Cat> listCats,
                               List<Dog> listDogs,
                               List<Zebra> listZebras) {
        String workingDirectory = System.getProperty("user.dir");
        String readFilePath = workingDirectory + "\\telukhin\\8\\telukhin\\task1\\zoo.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(readFilePath))) {
            for (String textLine; (textLine = in.readLine()) != null; ) {
                String[] arr = textLine.split(" ");
                if (arr[0].equals("Cat")) {
                    Cat cat = new Cat(arr[1], Integer.parseInt(arr[2]));
                    listAnimals.add(cat);
                    listCats.add(cat);
                } else if (arr[0].equals("Dog")) {
                    Dog dog = new Dog(arr[1], Integer.parseInt(arr[2]));
                    listAnimals.add(dog);
                    listDogs.add(dog);
                } else if (arr[0].equals("Zebra")) {
                    Zebra zebra = new Zebra(arr[1], Integer.parseInt(arr[2]));
                    listAnimals.add(zebra);
                    listZebras.add(zebra);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
