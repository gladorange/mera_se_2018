package los.task1;

public class Main
{
	public static void main(String[] args) 
	{
		Author Dennis = new Author("Dennis", "Ritchie", 1941, "USA");
		Dennis.addBook("C programming language", 1978, 534);
		Author Herbert = new Author("Herbert", "Schildt", 1951, "USA");
		Herbert.addBook("Java: The Complete Reference", 2012, 1102);
		Author Bjarne = new Author("Bjarne", "Stroustrup", 1950, "Denmark");
		Bjarne.addBook("A Tour of C++", 2013, 190);
		Bjarne.addBook("The C++ Programming Language", 1991, 696);
		
        Dennis.printNumberPagesOneAuthor(); 	
		Herbert.printNumberPagesOneAuthor();
        Bjarne.printNumberPagesOneAuthor();		
		
		Dennis.printNumberPagesAllAuthors();
	}
}