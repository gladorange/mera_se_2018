package los.task1;

public class Book
{
	private String title;
	private int year_publication;
	private Author author;
	private long quantity_pages;
	private static long quantity_pages_all_books = 0;

	public Book(String title, int year_publication, long quantity_pages, Author author)
	{
		this.title = title; 
		this.year_publication = year_publication;
		this.quantity_pages = quantity_pages;
		this.author = author;
		quantity_pages_all_books += quantity_pages;
	}

	public String getTitle() {
		return title;
	}

	public int getYear_publication() {
		return year_publication;
	}

	public long getQuantity_pages()
	{
		return quantity_pages;
	}

	public Author getAuthor() {
		return author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setYear_publication(int year_publication) {
		this.year_publication = year_publication;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setQuantity_pages(long quantity_pages) {
		this.quantity_pages = quantity_pages;
	}

	public static long getQuantity_pages_all_books() {
		return quantity_pages_all_books;
	}
}

