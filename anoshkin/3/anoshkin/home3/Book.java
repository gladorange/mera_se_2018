package anoshkin.home3;

public class Book {
    private String title;
    private String publishDate;
    private Author author;
    private int pages;

    public Book(String title, String publishDate, Author author, int pages){
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.pages = pages;
        this.author.addBook(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
