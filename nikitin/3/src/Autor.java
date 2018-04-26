package src;

import java.util.ArrayList;
import java.util.Date;

public class Autor extends Person {

    private ArrayList<Book> books = new ArrayList<>();
    private int totalPages = 0;

    public Autor(String firstName, String secondName, Date birthday, String country) {
        super(firstName, secondName, birthday, country);
    }

    public void printBooks() {
        System.out.println(String.format("====%s's Books====", this.getSecondName()));
        for (Book book: this.books) {
            book.printBookInfo();
        }
        System.out.println("\t\tTotal books: " + this.books.size());
        System.out.println("\t\tTotal pages: " + this.totalPages);
    }

    private Book getBook(String title){
        for (Book book: this.books) {
            if (book.getTitle() == title) {
                return book;
            }
        }
        return null;
    }

    void writeBook(String title, int pages) {
        this.books.add(new Book(title, new Date(), this, pages));
        this.totalPages+=pages;
    }

    void burnBook(String title) {
        Book book = getBook(title);
        if (book != null) {
            this.books.remove(book);
            Book.delete(book);
            System.out.println(String.format("The \"%s\" became ashes", title));
        }
    }
}
