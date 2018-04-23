package anoshkin.home3;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Author chekhov = new Author("Anton", "Chekhov", "29 january 1860", "Russia");
        Author shak = new Author("William", "Shakespeare", "26 April 1564", "England");
        Author hemin = new Author("Ernest", "Hemingway", "21 July 21 1899", "The USA");
        Book chaika = new Book("Chaika", "22 June 2012", chekhov, 150);
        Book  threeSisters = new Book("Three Sisters", "01 January 2018", chekhov, 250);
        Book hamlet = new Book ("Hamlet", "16 April 1999", shak, 1100);
        Book kinsmen = new Book("The Two Noble Kinsmen", "3 July 1699", shak, 525);
        Book oldMan = new Book("The Old Man and the Sea", "29 December 1951", hemin, 219);
        Book sun = new Book("The Sun Also Rises", "5 October 1926", hemin, 139);

        Author[] authors = {chekhov, shak, hemin};
        int totalPages = 0;
        for(Author aut : authors){
            int authorPages = 0;
            List<Book> bookL = aut.getBooks();
            for(Book b: bookL){
                authorPages += b.getPages();
            }
            System.out.println(aut + " total pages is: " + authorPages);
            totalPages += authorPages;
        }
        System.out.println("Total pages: " + totalPages);
        System.out.println("Total persons created: " + Person.getCount());
    }
}
