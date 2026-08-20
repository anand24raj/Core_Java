/*Design a program to demonstrate inheritance and encapsulation in Java.

Create a base class Book with private fields:
bookID, title, isIssued (boolean)

Methods: showDetails() ->displays book info, issueBook() ->marks as issued, returnBook() ->marks as returned

Create a subclass Fiction that extends Book and adds:
genre (e.g., Mystery, Fantasy)

Create a subclass NonFiction that extends Book and adds:
subject (e.g., History, Science)

Demonstrate the behavior by creating objects of Fiction and NonFiction, issuing and returning books, and displaying status.*/

package com.nit.polymorphism;

public class BookDetail
{
   void main() 
   {
       String choice = IO.readln();
       if (choice == null) choice = "";

       switch (choice) {
           case "test1" -> 
           {
               Fiction fictionBook = new Fiction(1, "Harry Potter", false, "Fantasy");

               NonFiction nonFictionBook = new NonFiction(2, "A Brief History of Time", true, "Science");
               
               fictionBook.showDetails();
               nonFictionBook.showDetails();
           }

           case "test2" -> 
           {
               Fiction fictionBook = new Fiction(1, "Harry Potter", false, "Fantasy");
               
               NonFiction nonFictionBook = new NonFiction(2, "A Brief History of Time", true, "Science");

               IO.println("Fiction Book Status: " + (fictionBook.isIssued() ? "Issued" : "Available"));
               IO.println("Non-Fiction Book Status: " + (nonFictionBook.isIssued() ? "Issued" : "Available"));
           }

           default -> IO.println("Invalid Test Option");
       }
   }
}

class Book {
   private int bookID;
   private String title;
   private boolean isIssued;

   public Book(int bookID, String title, boolean isIssued) 
   {
       this.bookID = bookID;
       this.title = title;
       this.isIssued = isIssued;
   }

   
   public int getBookID() 
   {
        return bookID;
   }
   public void setBookID(int bookID)
   {
        this.bookID = bookID; 
   }

   public String getTitle() 
   { 
       return title; 
   }
   public void setTitle(String title) 
   { 
       this.title = title; 
   }

   public boolean isIssued() 
   { 
       return isIssued; 
   }

   public void setIssued(boolean issued) 
   { 
       this.isIssued = issued; 
   }

   public void issueBook() 
   {
       if (!isIssued) {
           isIssued = true;
       }
   }

   public void returnBook() 
   {
       if (isIssued) {
           isIssued = false;
       }
   }

   public void showDetails() 
   {
       IO.println("Title: " + title);
       IO.println("Status: " + (isIssued ? "Issued" : "Available"));
   }
}

class Fiction extends Book {
   private String genre;

   public Fiction(int bookID, String title, boolean isIssued, String genre) 
   {
       super(bookID, title, isIssued);
       this.genre = genre;
   }

   public String getGenre() 
   { 
       return genre; 
   }
   public void setGenre(String genre) 
   {
       this.genre = genre; 
   }

   @Override
   public void showDetails() 
   {
       IO.println("Fiction Book Details:");
       IO.println("Title: " + getTitle());
       IO.println("Genre: " + genre);
       IO.println("Status: " + (isIssued() ? "Issued" : "Available"));
   }
}

class NonFiction extends Book 
{
   private String subject;

   public NonFiction(int bookID, String title, boolean isIssued, String subject) 
   {
       super(bookID, title, isIssued);
       this.subject = subject;
   }

   public String getSubject() 
   { 
       return subject; 
   }
   public void setSubject(String subject) 
   { 
       this.subject = subject; 
   }

   @Override
   public void showDetails() 
   {
       IO.println("Non-Fiction Book Details:");
       IO.println("Title: " + getTitle());
       IO.println("Subject: " + subject);
       IO.println("Status: " + (isIssued() ? "Issued" : "Available"));
   }
}
