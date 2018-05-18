package telukhin.task1;


public class Book {

    private String title;
    private int yearPublish;
    private Author author;
    private int pageCount;

    public Book(String title, int year, Author author, int pageCount) {
        this.title = title;
        this.yearPublish = year;
        this.author = author;
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
}
