package terletskiy.task1;

import java.util.ArrayList;

public class Author extends Person{

    private ArrayList<Book> books = new ArrayList<Book>();
    private int allPagesCounter = 0;
    public Author(String firstName, String lastName, int birthYear) {
        super(firstName, lastName, birthYear);
    }

    public void addBook(Book book)
    {
        if (books.contains(books))
        {
            return; // already in list
        }
        books.add(book);
        allPagesCounter += book.getPages();
    }

    public int getAllPages() {
        return allPagesCounter;
    }
}
