package telukhin;

import telukhin.task1.Artist;
import telukhin.task1.Person;
import telukhin.task1.Style;

public class Main {
    public static void main(String[] args) {
        Artist artist = new Artist("Иван", "Айвазовский", 1817, Style.ROMANTISM);
        Person person = new Person("Вася", "Пупкин", 1995);

        System.out.println(artist.getStyle());
        System.out.println(Style.toRussian(artist.getStyle()));
        artist.printInfo();
        person.printInfo();
    }
}
