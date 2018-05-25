package los.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        String fileName;

        ArrayList<AnimalWriter<?>> animalWriters = new ArrayList<>();

        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Zebra> zebras = new ArrayList<>();

        CatWriter catWriter = new CatWriter();
        DogWriter dogWriter = new DogWriter();
        ZebraWriter zebraWriter = new ZebraWriter();

        // adding collection of animals to ArrayList
        cats.add(new Cat("Vasya",2));
        cats.add(new Cat("Barsik",6));
        cats.add(new Cat("Tishka",9));
        cats.add(new Cat("Boris",3));

        dogs.add(new Dog("Barbos",1));
        dogs.add(new Dog("Baxter",12));
        dogs.add(new Dog("Hatiko",5));
        dogs.add(new Dog("Black",8));

        zebras.add(new Zebra("Marty",20));
        zebras.add(new Zebra("Strips",100));
        zebras.add(new Zebra("Agafia",50));
        zebras.add(new Zebra("Agrippina",112));

        catWriter.setANIMAL(cats);
        dogWriter.setANIMAL(dogs);
        zebraWriter.setANIMAL(zebras);

        animalWriters.add(catWriter);
        animalWriters.add(dogWriter);
        animalWriters.add(zebraWriter);

        // writing in JSON format all information about all animals to files
        for(AnimalWriter<?> aw:animalWriters)
        {
            fileName = String.format("./%s.json", aw.getAnimalClassName());
            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.format("./%s.json", aw.getAnimalClassName()))))
            {
                aw.writeAll(bufferedWriter);
            }
            catch (IOException ex)
            {
                System.out.printf("Error: exception during writing file with name %s: %s%n",fileName, ex);
            }
            System.out.format("File with name %s was written successfully. %n", fileName);
        }
    }
}
