public class MainClass {
    public static void main(String[] args) {

        Painter FirstPainter = new Painter("Вася", "Пупкин");
        FirstPainter.printInfo();

        Author FirstAuthor = new Author("Александр", "Пушкин", "06.06.79", "Москва");
        Author SecondAuthor = new Author("Сергей", "Есенин", "03.10.95", "Константиново");
        Author ThirdAuthor = new Author("Максим", "Горький", "28.03.68", "Горький");
        System.out.println("Общее число авторов: " + Author.getCountOfPerson());

        Book[] booksFirstAuthor = new Book[1];
        booksFirstAuthor[0] = new Book("Руслан и Людмила", 1820, 75, FirstAuthor);
        FirstAuthor.setBooks(booksFirstAuthor);

        Book[] booksSecondAuthor = new Book[1];
        booksSecondAuthor[0] = new Book("Радуница", 1916, 100, SecondAuthor);
        SecondAuthor.setBooks(booksSecondAuthor);

        Book[] booksThirdAuthor = new Book[2];
        booksThirdAuthor[0] = new Book("Мать", 1906, 305, ThirdAuthor);
        booksThirdAuthor[1] = new Book("Детство", 1914, 500, ThirdAuthor);
        ThirdAuthor.setBooks(booksThirdAuthor);

        Author[] authors = {FirstAuthor, SecondAuthor, ThirdAuthor};
        getPageCountAllAuthors(authors);
    }

    public static int getPageCountOfAuthor(Author author) {
        int pageCount = 0;
        for (Book eachBook : author.getBooks()) {
            pageCount += eachBook.getCountOfPages();
        }
        System.out.println("Имя автора: " + author.getFirstName() + " " + author.getSecondName() +
                ", Количество страниц в произведениях: " + pageCount);
        return pageCount;
    }

    public static int getPageCountAllAuthors(Author[] authors) {
        int pageCountOfAuthors = 0;
        for (Author eachAuthor : authors) {
            pageCountOfAuthors += getPageCountOfAuthor(eachAuthor);
        }
        System.out.println("Общее количество страниц : " + pageCountOfAuthors);
        return pageCountOfAuthors;
    }

}
