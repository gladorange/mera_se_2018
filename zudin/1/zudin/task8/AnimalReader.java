package zudin.task8;

import java.io.*;
import java.util.ArrayList;

public class AnimalReader {

    public boolean readNextAnimal (ArrayList<Animal> animals, ArrayList<Cat> cats, ArrayList<Dog> dogs, ArrayList<Zebra> zebras) throws IOException {

        File file = new File("/home/eugene/mera_se_2018/zudin/1/zudin/task8/zoo.txt");
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

            while ((line = in.readLine())!= null) {
               String[] subStrings = line.split(" ");
                if (subStrings[0].contains("Cat")) {
                    Cat cat = new Cat(subStrings[1], Integer.parseInt(subStrings[2]));
                    cats.add(cat);
                    animals.add(cat);
                }
                if (subStrings[0].contains("Dog")) {
                    Dog dog = new Dog(subStrings[1], subStrings[2]);
                    dogs.add(dog);
                    animals.add(dog);
                }
                if (subStrings[0].contains("Zebra")) {
                    Zebra zebra = new Zebra(subStrings[1], Integer.parseInt(subStrings[2]));
                    zebras.add(zebra);
                    animals.add(zebra);
                }
            }
            in.close();
            return false;
        }
}
