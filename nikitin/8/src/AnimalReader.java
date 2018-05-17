package src;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.Collection;
import java.io.File;

public class AnimalReader {
    private BufferedReader in;

    public AnimalReader(String filename) throws FileNotFoundException {
        URL url = getClass().getResource(filename);
        File file = new File(url.getPath());
        in = new BufferedReader(new FileReader(file));
    }

    public boolean readNextAnimal(Collection<Cat> cats,
                               Collection<Dog> dogs,
                               Collection<Zebra> zebras,
                               Collection<Animal> animals) throws Throwable {
        String line = in.readLine();
        if (line == null) {
            in.close();
            return false;
        }

        String[] animalParams = line.split(" ", 3);

        if (animalParams.length != 3) {
            System.out.println("Cannot parse animal from line: " + line);
            return true;
        }

        Animal animal;
        switch (animalParams[0]) {
            case "Cat":
                animal = new Cat(animalParams[1], Integer.parseInt(animalParams[2]));
                cats.add((Cat)animal);
                break;
            case "Dog":
                animal = new Dog(animalParams[1], animalParams[2]);
                dogs.add((Dog)animal);
                break;
            case "Zebra":
                animal = new Zebra(animalParams[1], Integer.parseInt(animalParams[2]));
                zebras.add((Zebra)animal);
                break;
            default:
                System.out.println("Unknown animal: " + animalParams[0]);
                return true;
        }

        animals.add(animal);
        return true;
    }

    protected void finalize() throws Throwable {
        in.close();
    }
}
