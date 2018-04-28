public class Book {
    private String bookName;
    private int yearOfPublication;
    private int countOfPages;
    private Author author;

    public int getCountOfPages() {
        return countOfPages;
    }

    public Book(String bookName, int yearOfPublication, int countOfPages, Author author) {
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
        this.countOfPages = countOfPages;
        this.author = author;
    }
}

