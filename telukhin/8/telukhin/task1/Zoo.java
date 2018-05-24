package telukhin.task1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private ArrayList<Animal> listAnimals;
    private ArrayList<Cat> listCats;
    private ArrayList<Dog> listDogs;
    private ArrayList<Zebra> listZebras;


    public Zoo(ArrayList<Animal> listAnimals,
               ArrayList<Cat> listCats,
               ArrayList<Dog> listDogs,
               ArrayList<Zebra> listZebras) {

        this.listAnimals = listAnimals;
        this.listCats = listCats;
        this.listDogs = listDogs;
        this.listZebras = listZebras;
    }

    public void setListAnimals(ArrayList<Animal> listAnimals) {
        this.listAnimals = listAnimals;
    }

    public void setListCats(ArrayList<Cat> listCats) {
        this.listCats = listCats;
    }

    public void setListDogs(ArrayList<Dog> listDogs) {
        this.listDogs = listDogs;
    }

    public void setListZebras(ArrayList<Zebra> listZebras) {
        this.listZebras = listZebras;
    }

    public ArrayList<Animal> getListAnimals() {
        return listAnimals;
    }

    public ArrayList<Cat> getListCats() {
        return listCats;
    }

    public ArrayList<Dog> getListDogs() {
        return listDogs;
    }

    public ArrayList<Zebra> getListZebras() {
        return listZebras;
    }


}
