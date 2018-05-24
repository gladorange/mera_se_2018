package telukhin.task1;

import java.io.*;
import java.util.ArrayList;

public class MainZoo {

    public static void main(String[] args) {

        ArrayList<Animal> listAnimals = new ArrayList<>();
        /*listAnimals.add(new Cat("Barsik", 7));
        listAnimals.add(new Dog("Bobik", 6));
        listAnimals.add(new Zebra("Moby", 230));*/

        ArrayList<Cat> listCats = new ArrayList<>();
        ArrayList<Dog> listDogs = new ArrayList<>();
        ArrayList<Zebra> listZebras = new ArrayList<>();

        /*Распределили по коллекциям животных*/
        /*for (Animal a : listAnimals) {
            if (a instanceof Cat) {
                listCats.add((Cat) a);
            } else if (a instanceof Dog) {
                listDogs.add((Dog) a);
            } else if (a instanceof Zebra) {
                listZebras.add((Zebra) a);
            }
        }*/

        /*Добавили в зоопарк общую коллекцию животных и каждого по отдельности*/
        Zoo zoo = new Zoo(listAnimals, listCats, listDogs, listZebras);

        /*Добавили в коллекции зоопарка новых животных*/
        AnimalReader.readNextAnimal(listAnimals, listCats, listDogs, listZebras);



        /*Просим поздороваться всех*/
        AnimalTalker.sayHelloAll(zoo.getListCats());
        AnimalTalker.sayHelloAll(zoo.getListDogs());
        AnimalTalker.sayHelloAll(zoo.getListZebras());
        AnimalTalker.sayHelloAll(zoo.getListAnimals());





    }
}
