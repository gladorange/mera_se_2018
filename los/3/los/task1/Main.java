package los.task1;

public class Main
{
	public static void main(String[] args) 
	{
		Author dennis = new Author("Dennis", "Ritchie", 1941, "USA");
		dennis.addBook("C programming language", 1978, 534);
		Author herbert = new Author("Herbert", "Schildt", 1951, "USA");
		herbert.addBook("Java: The Complete Reference", 2012, 1102);
		Author bjarne = new Author("Bjarne", "Stroustrup", 1950, "Denmark");
		bjarne.addBook("A Tour of C++", 2013, 190);
		bjarne.addBook("The C++ Programming Language", 1991, 696);
		
        dennis.printNumberPagesOneAuthor();
		herbert.printNumberPagesOneAuthor();
        bjarne.printNumberPagesOneAuthor();
		
		dennis.printNumberPagesAllAuthors();
	}
}