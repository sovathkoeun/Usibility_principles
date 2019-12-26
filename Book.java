package Homework;

public class Book {
		private String title;
		private String autor;
		private int publishYear;
		private boolean isBorrowed = true;
		
		// Constructor three arguments
		public Book(String title, String autor, int publishYear) {
			this.title = title;
			this.autor = autor;
			this.publishYear = publishYear;
		}
		
		// marks a book as borrowed 
		public void borowed() {
			isBorrowed = true;
		}
		
		// marks a book as NOT borrowed
		public void returnBack() {
			isBorrowed = false;
		}
		
		// returns the title of a book
		String getTitle() {
			return title;
		}
		
		// returns the author of a book
		String getAutor() {
			return autor;
		}
		
	   //returns the year of publishYear
		int getPublishYear() {
			return publishYear;
		}
		// returns whether or not a book is currently borrowed
		public String isBorrowed() {
			String BorrowedBooks;
			if(isBorrowed == true) {
				BorrowedBooks= "Not available ";
			}else {
				BorrowedBooks=  "Available";
			}
			return BorrowedBooks;
		}
	
		// displays the books author, title , year of publishing and borrowed status
		public String toString() {
			
			return "Title : "+title +"\n\t "+ autor+"--published" +" "+ publishYear +" \n\t "+"Status: " + isBorrowed() + " to borrow";
	  }
}
