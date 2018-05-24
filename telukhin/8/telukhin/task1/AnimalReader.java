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
                String classAnimal = arr[0];
                switch (classAnimal) {
                    case "Cat":
                        Cat cat = new Cat(arr[1], Integer.parseInt(arr[2]));
                        listAnimals.add(cat);
                        listCats.add(cat);
                        break;
                    case "Dog":
                        Dog dog = new Dog(arr[1], Integer.parseInt(arr[2]));
                        listAnimals.add(dog);
                        listDogs.add(dog);
                        break;
                    case "Zebra":
                        Zebra zebra = new Zebra(arr[1], Integer.parseInt(arr[2]));
                        listAnimals.add(zebra);
                        listZebras.add(zebra);
                        break;
                    default:
                        System.out.println(classAnimal + " Такого животног в классе нет");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
