package classwork2;

import java.util.Scanner;

//Base class Book
class Book {
	private String title;
	private String author;
	private double price;

	// Constructor
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	// Getters
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	// Method to display book details
	public void displayDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
}

//Derived class Fiction
class Fiction extends Book {
	// Constructor
	public Fiction(String title, String author, double price) {
		super(title, author, price);
	}

	// Override method to display book details
	@Override
	public void displayDetails() {
		System.out.println("Fiction Book Details:");
		super.displayDetails();
	}
}

//Derived class NonFiction
class NonFiction extends Book {
	// Constructor
	public NonFiction(String title, String author, double price) {
		super(title, author, price);
	}

	// Override method to display book details
	@Override
	public void displayDetails() {
		System.out.println("Non-Fiction Book Details:");
		super.displayDetails();
	}
}

//Main class to demonstrate the library management system
public class LibraryManagementSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input details for Fiction book
		System.out.println("Enter details for Fiction Book:");
		System.out.print("Title: ");
		String fictionTitle = scanner.nextLine();
		System.out.print("Author: ");
		String fictionAuthor = scanner.nextLine();
		System.out.print("Price: ");
		double fictionPrice = scanner.nextDouble();
		scanner.nextLine(); // Consume newline left-over
		Fiction fictionBook = new Fiction(fictionTitle, fictionAuthor, fictionPrice);

		// Input details for Non-Fiction book
		System.out.println("Enter details for Non-Fiction Book:");
		System.out.print("Title: ");
		String nonFictionTitle = scanner.nextLine();
		System.out.print("Author: ");
		String nonFictionAuthor = scanner.nextLine();
		System.out.print("Price: ");
		double nonFictionPrice = scanner.nextDouble();
		scanner.nextLine(); // Consume newline left-over
		NonFiction nonFictionBook = new NonFiction(nonFictionTitle, nonFictionAuthor, nonFictionPrice);

		// Display details of both books
		fictionBook.displayDetails();
		nonFictionBook.displayDetails();

		scanner.close();
	}
}
