package los.task1;

public class Book
{
	private String title;
	private int yearPublication;
	private Author author;
	private long quantityPages;
	private static long quantityPagesAllBooks = 0;

	public Book(String title, int yearPublication, long quantityPages, Author author)
	{
		this.title = title; 
		this.yearPublication = yearPublication;
		this.quantityPages = quantityPages;
		this.author = author;
		quantityPagesAllBooks += quantityPages;
	}

	public String getTitle() {
		return title;
	}

	public int getYearPublication() {
		return yearPublication;
	}

	public long getQuantityPages()
	{
		return quantityPages;
	}

	public Author getAuthor() {
		return author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setYearPublication(int yearPublication) {
		this.yearPublication = yearPublication;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setQuantityPages(long quantityPages) {
		this.quantityPages = quantityPages;
	}

	public static long getQuantityPagesAllBooks() {
		return quantityPagesAllBooks;
	}
}

