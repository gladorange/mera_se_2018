package anoshkin.home3;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private List<Book> books = new ArrayList<Book>();

    public Author(String name, String surname, String birthDate, String country){
        super(name, surname, birthDate, country);
    }

    public void addBook(Book newbook){
        this.books.add(newbook);
    }

    public List<Book> getBooks(){
        return this.books;
    }
}
