package terletskiy.task1;

public class Book {
    /*
    - Название
    - Год издания
    - Автор (Объектный тип Author)
    - Количество страниц
    */
    private String name;
    private int year;
    private Author author;
    private int pages;
    private static int allPagesCounter = 0;

    public Book(String name, int year, Author author, int pages) {

        this.name = name;
        this.year = year;
        this.author = author;
        this.pages = pages;
        this.author.AddBook(this);
        allPagesCounter += pages;
    }

    public static int getAllPages() {
        return allPagesCounter;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }
}
