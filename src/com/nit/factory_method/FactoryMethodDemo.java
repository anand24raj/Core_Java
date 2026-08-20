package com.nit.factory_method;

public class FactoryMethodDemo {
    void main() {
        // Using the factory method to get a Book object
        Book b1 = Book.getBookObject();
        IO.println(b1);  // prints the book details
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    // Private constructor
    private Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Override toString() method for printing
    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
    }

    // Static Factory Method
    public static Book getBookObject() {
        Book book = new Book("Java", "James Gosling", 800);
        return book;
    }
}
