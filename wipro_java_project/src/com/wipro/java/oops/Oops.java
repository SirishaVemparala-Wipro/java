package com.wipro.java.oops;
abstract class Book {
    private String title;
    private int pages;

    // Constructor
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    // Getter and Setter methods (Encapsulation)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayDetails();
}

// FictionBook class extends Book (Inheritance)
class FictionBook extends Book {

    // Constructor
    public FictionBook(String title, int pages) {
        super(title, pages);  // Call to superclass constructor
    }

    // Overriding abstract method from Book (Polymorphism)
    @Override
    public void displayDetails() {
        System.out.println("Fiction Book - Title: " + getTitle() + ", Pages: " + getPages());
    }
}

// NonFictionBook class extends Book (Inheritance)
class NonFictionBook extends Book {

    // Constructor
    public NonFictionBook(String title, int pages) {
        super(title, pages);  // Call to superclass constructor
    }

    // Overriding abstract method from Book (Polymorphism)
    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book - Title: " + getTitle() + ", Pages: " + getPages());
    }
}

// ReferenceBook class extends Book (Inheritance)

public class Oops {
    public static void main(String[] args) {
        // Create instances of different types of books
        Book fictionBook = new FictionBook("The Great Adventure", 300);
        Book nonFictionBook = new NonFictionBook("A Brief History of Time", 250);
      

        // Display details of all books
        fictionBook.displayDetails();  // Polymorphism in action
        nonFictionBook.displayDetails();  // Polymorphism in action


        // Demonstrate encapsulation by changing the title of a book
        fictionBook.setTitle("The Great Journey");
        System.out.println("\nUpdated Book Details:");
        fictionBook.displayDetails();  // Show updated details
    }
}
