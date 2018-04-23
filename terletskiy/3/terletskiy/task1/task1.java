package terletskiy.task1;

public class task1 {
    public static void main(String[] args) {
        Author author1 = new Author("Author1", "lastName1", 1901);
        Author author2 = new Author("Author2", "lastName2", 1902);
        Author author3 = new Author("Author3", "lastName3", 1903);

        new Book("Book1", 1950, author1, 100);
        new Book("Book2", 1950, author1, 100);

        new Book("Book3", 1950, author2, 100);
        new Book("Book4", 1950, author2, 100);

        new Book("Book5", 1950, author3, 100);

        for (Author author: new Author[] {author1, author2, author3}) {
            System.out.println(String.format("Общее число страниц во всех книгах %s: %d", author, author.getAllPages()));
        }
        System.out.println(String.format("Количество созданных объектов Person: %d", Person.getObjectCounter()));
        System.out.println(String.format("Общее число страниц во всех книгах вообще: %d", Book.getAllPages()));
    }
}