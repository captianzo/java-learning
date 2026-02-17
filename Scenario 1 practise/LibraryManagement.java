import java.util.ArrayList;
import java.util.Scanner;

class Book {
	String title;
	String author;
	String isbn;

	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public ArrayList getDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter book title: ");
		String booktitle = sc.next();

		System.out.print("Enter book title: ");
		String bookauthor = sc.next();

		System.out.print("Enter book title: ");
		String bookisbn = sc.next();

		ArrayList<String> newbook = new ArrayList();
		newbook.add(booktitle);
		newbook.add(bookauthor);
		newbook.add(bookisbn);
		return newbook;
	}
}

class Library extends Book {
	ArrayList<String> books = new ArrayList();
	
	void addBook (){
		
	}

	void searchByTitle (){
		Scanner sc = new Scanner(System.in);
		String newbook = sc.next();
		if (books.contains(newbook)){
			System.out.println("Book found in the library: " + newbook);
		}
		else{
			System.out.println("Book not found!");
		}
	}
}

public class LibraryManagement {
	public static void main(String[] args) {
		
	}
}
