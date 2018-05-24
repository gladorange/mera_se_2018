package los.task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.regex.Pattern;

public class AnimalReader
{
    BufferedReader inputReader;

    public AnimalReader(String fileName) throws FileNotFoundException
    {
        inputReader = new BufferedReader(new FileReader(fileName));
    }

    public boolean readNextAnimal(Collection<Animal> arrayListAnimals,
                                  Collection<Cat> arrayListCats,
                                  Collection<Dog> arrayListDogs,
                                  Collection<Zebra> arrayListZebras)
    {
        final int FIRST_COLUMN = 0, SECOND_COLUMN = 1, THIRD_COLUMN = 2;
        Pattern commaPattern = Pattern.compile("[,]+");
        String lineFromFile;
        String [] bufferOneField;
        Animal animal;

        try
        {
            lineFromFile = inputReader.readLine();
        }
        catch (IOException ex)
        {
            return false;
        }

        if(null == lineFromFile)
        {
            return false;
        }

        bufferOneField = commaPattern.split(lineFromFile);

        switch(bufferOneField[FIRST_COLUMN])
        {
            case "Cat":
            {
                animal = new Cat(bufferOneField[SECOND_COLUMN], Integer.valueOf(bufferOneField[THIRD_COLUMN]));
                arrayListCats.add((Cat)animal);
                break;
            }
            case "Dog":
            {
                animal = new Dog(bufferOneField[SECOND_COLUMN], Integer.valueOf(bufferOneField[THIRD_COLUMN]));
                arrayListDogs.add((Dog)animal);
                break;
            }
            case "Zebra":
            {
                animal = new Zebra(bufferOneField[SECOND_COLUMN], Integer.valueOf(bufferOneField[THIRD_COLUMN]));
                arrayListZebras.add((Zebra)animal);
                break;
            }
            default:
            {
                return false;
            }
        }

        arrayListAnimals.add(animal);
        return true;
    }
}
