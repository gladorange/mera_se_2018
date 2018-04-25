public class Author extends Person {
     private Book books[];

     public Book[] getBooks() {
          return books;
     }

     public void setBooks(Book[] books) {
          this.books = books;
     }

     public Author(String firstName, String secondName, String birthdayDate, String city) {
          super(firstName, secondName, birthdayDate, city);
     }
}
