package rybkin.task3;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Гоголь", 1802, "Украина");
        Author author2 = new Author("Александр", "Пушкин", 1803, "Россия");
        Author author3 = new Author("Лев", "Толстой", 1804, "Пакистан");
        Books book1 = new Books("Один", 1111, author1, 30);
        Books book2 = new Books("Один", 2222, author1, 40);
        Books book3 = new Books("Один", 3333, author2, 50);
        Books book4 = new Books("Один", 4444, author2, 60);
        Books book5 = new Books("Один", 5555, author3, 70);
        Books book6 = new Books("Один", 6666, author3, 80);
        System.out.println("У автора " + author1.getFirstName() + " общее кол-во страниц = " + author1.pageForAuthor());
        System.out.println("У автора " + author2.getFirstName() + " общее кол-во страниц = " + author2.pageForAuthor());
        System.out.println("У автора " + author3.getFirstName() + " общее кол-во страниц = " + author3.pageForAuthor());
    }


}
