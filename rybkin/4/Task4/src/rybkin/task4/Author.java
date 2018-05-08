package rybkin.task4;

public class Author extends Person {

    private Books books[];

    public Author(String firstName, String secondName, Integer yearOfBirth, String country) {
        super(firstName, secondName, yearOfBirth, country);
    }

    public Books[] getBooks() {
        return books;
    }

    public void setBooks(Books[] books) {
        this.books = books;
    }

    public int pageForAuthor() {
        int k = 0;
        for (Books book : books) {
            k += book.getNumberOfPages();
        }
        return k;
    }
}
