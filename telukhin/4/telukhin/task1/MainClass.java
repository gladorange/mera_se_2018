package telukhin.task1;

public class MainClass {
    public static void main(String[] args) {
        Artist artist = new Artist("Иван", "Айвазовский", 1817, Style.ROMANTISM);
        Person person = new Person("Вася", "Пупкин", 1995);

        System.out.println(artist.getStyle());
        System.out.println(Style.toRussian(artist.getStyle()));
        artist.printInfo();
        person.printInfo();
    }
}
