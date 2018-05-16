package los.task1;

import java.util.ArrayList;

public class Author extends Person
{
	private ArrayList<Book> written_books = new ArrayList<Book>();

    public Author(String name, String surname, int year_birthday, String country)
	{
		super(name, surname, year_birthday, country);
	}

	public ArrayList<Book> getBooks()
    {
        return written_books;
    }

    public void addBook(String title, int year_publication, long quantity_pages)
    {
        Book book = new Book (title, year_publication, quantity_pages, this);
        this.written_books.add(book);
    }

    public void printNumberPagesOneAuthor()
    {
        long quantity_pages_all_books_one_author = 0;

        for (Book b : written_books)
        {
            quantity_pages_all_books_one_author += b.getQuantity_pages();
        }

        System.out.println("Total number pages for all books of author " +
                    this.getName() +
                    " " +
                    this.getSurname() +
                    " :" +
                    quantity_pages_all_books_one_author);
    }

    public void printNumberPagesAllAuthors() {
        System.out.println("Total number pages for all books of all authors: " + this.written_books.get(0).getQuantity_pages_all_books());
    }
}


