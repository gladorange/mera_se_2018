package rybkin.task4;

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

        Author[] authors = {author1, author2, author3};
        int k = 0;
        for (Author aauthor : authors) {
            System.out.println("У автора " + aauthor.getFirstName() + " " + aauthor.getSecondName() + " общее кол-во страниц = " + aauthor.pageForAuthor());
            k = k + aauthor.pageForAuthor();
        }
        System.out.println("Общее количество страниц " + k);

        System.out.println(Person.getPersonCount());

        System.out.println(Painter.Style.CUBISM);

    }
}
