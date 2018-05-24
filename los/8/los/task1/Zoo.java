package los.task1;

import java.util.ArrayList;

public class Zoo
{
    private ArrayList<Animal> arrayListAnimals;
    private ArrayList<Cat> arrayListCats;
    private ArrayList<Dog> arrayListDogs;
    private ArrayList<Zebra> arrayListZebras;

    public Zoo()
    {
        arrayListAnimals = new ArrayList<>();
        arrayListCats = new ArrayList<>();
        arrayListDogs = new ArrayList<>();
        arrayListZebras = new ArrayList<>();
    }

    public ArrayList<Animal> getArrayListAnimals()
    {
        return arrayListAnimals;
    }

    public ArrayList<Cat> getArrayListCats()
    {
        return arrayListCats;
    }

    public ArrayList<Dog> getArrayListDogs()
    {
        return arrayListDogs;
    }

    public ArrayList<Zebra> getArrayListZebras()
    {
        return arrayListZebras;
    }
}
