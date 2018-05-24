package los.task1;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args)
    {
        String fileName = "zoo.txt";
        Zoo zoo = new Zoo();
        AnimalReader animalReader;

        try
        {
            animalReader = new AnimalReader(fileName);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Exception caught: " + ex);
            System.out.printf("Could not find file \"%s\" with list of animals.%n", fileName);
            return;
        }

        // Just reading file before end of file
        while(animalReader.readNextAnimal(zoo.getArrayListAnimals(), zoo.getArrayListCats(), zoo.getArrayListDogs(), zoo.getArrayListZebras()))
        {
        }

        System.out.println("Приветы от котов:");
        AnimalTalker.sayHelloAll(zoo.getArrayListCats());

        System.out.println("Приветы от cобак:");
        AnimalTalker.sayHelloAll(zoo.getArrayListDogs());

        System.out.println("Приветы от зебр:");
        AnimalTalker.sayHelloAll(zoo.getArrayListZebras());

        System.out.println("Приветы от всех животных:");
        AnimalTalker.sayHelloAll(zoo.getArrayListAnimals());
    }
}
