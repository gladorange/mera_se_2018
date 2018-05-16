package los.task1;

import java.util.ArrayList;

public class Author extends Person
{
	private ArrayList<Book> writtenBooks = new ArrayList<Book>();

    public Author(String name, String surname, int yearBirthday, String country)
	{
		super(name, surname, yearBirthday, country);
	}

	public Book getBooks(int i)
    {
            return writtenBooks.get(i);
    }

    public void addBook(String title, int yearPublication, long quantityPages)
    {
        Book book = new Book (title, yearPublication, quantityPages, this);
        this.writtenBooks.add(book);
    }

    public void printNumberPagesOneAuthor()
    {
        long quantityPagesAllBooksOneAuthor = 0;

        for (Book b : writtenBooks)
        {
            quantityPagesAllBooksOneAuthor += b.getQuantityPages();
        }

        System.out.format("Total number pages for all books of author %s %s : %d \n",
                    this.getName(),
                    this.getSurname(),
                    quantityPagesAllBooksOneAuthor);
    }

    public void printNumberPagesAllAuthors() {
        if(!this.writtenBooks.isEmpty())
        {
            System.out.println("Total number pages for all books of all authors: " + this.writtenBooks.get(0).getQuantityPagesAllBooks());
        }
        else
        {
            System.out.println("List of number pages is empty");
        }

    }
}


