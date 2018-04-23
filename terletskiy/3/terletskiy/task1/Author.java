package terletskiy.task1;

import java.util.ArrayList;

public class Author extends Person{

    private ArrayList<Book> books = new ArrayList<Book>();
    private int allPagesCounter = 0;
    public Author(String firstName, String lastName, int birthYear) {
        super(firstName, lastName, birthYear);
    }

    public void AddBook(Book book)
    {
        if (books.indexOf(books) == -1)
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
