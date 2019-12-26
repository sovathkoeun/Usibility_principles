package Homework;
import java.util.List;
import java.util.ArrayList;
public class Demo_Book {

	public static void main(String[] args) {
		Book book1 = new Book("Don't make me think","Steve Krung",2000);
		Book book2 = new Book("Pro Java Programming","Terrill",2005);
		Book book3 = new Book("Programming in Python 3","Mark Summerfield",2005);
		Book book4 = new Book("The Clean Coder","Robert",2011);
		Book book5 = new Book("The Art of Agile Development","James Shore",2007);
		Book book6 = new Book("Head First Design Patterns","Eric Freeman",2004);
		Book book7 = new Book("The Linux Command Line","Willian",2009);
		Book book8 = new Book("Code Complete","Steve",1993);
		Book book9 = new Book("Unit Test Patterns","Gerard Meszaros",2003);
		Book book10 = new Book("The C++ Programming Language","Bjarne Stroustup",2013);
		
		book1.borowed();
		book2.returnBack();
		book3.borowed();
		book4.borowed();
		book5.returnBack();
		book6.returnBack();
		book7.borowed();
		book8.returnBack();
		book9.returnBack();
		book10.borowed();
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(book4.toString());
		System.out.println(book5.toString());
		System.out.println(book6.toString());
		System.out.println(book7.toString());
		System.out.println(book8.toString());
		System.out.println(book9.toString());
		System.out.println(book10.toString());
		System.out.println();
		
		// Create list of array for table
		List<Book> books = new ArrayList<>();
		System.out.println("------------------------------------------------------------------------------------");
		System.out.printf("%30s %20s %10s %10s","TITLE","AUTHOR","YEAR","STATUS");
		System.out.println();
		 System.out.println("------------------------------------------------------------------------------------");
		 books.add(book1);
		 books.add(book2);
		 books.add(book3);
		 books.add(book4);
		 books.add(book5);
		 books.add(book6);
		 books.add(book7);
		 books.add(book8);
		 books.add(book9);
		 books.add(book10);
		for(Book Book : books) {
			System.out.printf("%30s %20s %10s %20s",Book.getTitle(),Book.getAutor(),Book.getPublishYear(),Book.isBorrowed());
			System.out.println();
		}
		 System.out.println("-------------------------------------------------------------------------------------");
	}
}
