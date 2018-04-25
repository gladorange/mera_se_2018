package rybkin.task3;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Гоголь", 1802, "Украина");
        Author author2 = new Author("Александр", "Пушкин", 1803, "Россия");
        Author author3 = new Author("Лев", "Толстой", 1804, "Пакистан");
        Books book1 = new Books("Один", 1111, author1, 30);
        Books book2 = new Books("Два", 2222, author1, 40);
        Books book3 = new Books("Три", 3333, author2, 50);
        Books book4 = new Books("Четыре", 4444, author2, 60);
        Books book5 = new Books("Пять", 5555, author3, 70);
        Books book6 = new Books("Шесть", 6666, author3, 80);

        author1.setBooks(new Books[]{book1, book2});
        author2.setBooks(new Books[]{book3, book4});
        author3.setBooks(new Books[]{book5, book6});
        System.out.println("У автора " + author1.getFirstName() + " " + author1.getSecondName() + " общее кол-во страниц = " + author1.pageForAuthor());
        System.out.println("У автора " + author2.getFirstName() + " " + author2.getSecondName() + " общее кол-во страниц = " + author2.pageForAuthor());
        System.out.println("У автора " + author3.getFirstName() + " " + author3.getSecondName() + " общее кол-во страниц = " + author3.pageForAuthor());
        System.out.println("Общее количество страниц " + author1.pageForAuthor() + author2.pageForAuthor() + author3.pageForAuthor());
        for (int i =0; i<10;i++){
            Person person = new Person();
        }
        System.out.println(Person.getPersonCount());
    }


}
