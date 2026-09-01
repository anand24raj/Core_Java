/*Create another BLC class Library which contains following non static 
methods :

1) Method Name     : displayAvailableBooks()
Argument           : 1 argument of type Vector<Book>
Return Type        : void
Access modifier    : public
In this method display all the available books in the Library.
[See the Test cases for More Details]

2) Method Name     : issueBook()
Argument           : 2 arguments [Vector<Book>, IO io]
Return Type        : void
Access modifier    : public
In this method issueBook from the Library based on the id of the Book, 
If Book is available (based on the id) then remove() the Book from the Library 
otherwise give an error message  "Book with ID 103 not Found"
[See Test cases for More details]


3) Method Name     : searchBook()
Argument           : 2 arguments [Vector<Book>, IO io]
Return Type        : void
Access modifier    : public
In this method search a Book from the Library by using title OR author, 
If Book is available either by title OR Author then give a message "Book Found", 
If not available then give an error message "No matching books found."
*/
package com.core_java.Collection.Vector;

import java.util.Scanner;
import java.util.Vector;

public class Library 
{
    public void displayAvailableBooks(Vector<Book> bookList)
    {
        IO.println("Available Books in the Library : ");
        
        for(Book book : bookList)
        {
            IO.println(book);
        }
    }

    public void issueBook(Vector<Book> bookList , Scanner sc)
    {
        int bookId = Integer.parseInt(IO.readln("Enter the Book Id : "));

        boolean found = false;

        for(int i = 0; i < bookList.size() ; i++) 
        {
            Book book = bookList.get(i);

            if (book.id().equals(bookId)) 
            {
                bookList.remove(i);

                IO.println("Issued: " + book);
                found = true;
                break;
            }
        }

        if (!found) 
        {
            IO.println("Book with ID " + bookId + " not Found");
        }
    }

    public void searchBook(Vector<Book> bookList, Scanner sc) 
    {        
        String keyword = IO.readln("Enter Book Author / title : ");

        boolean found = false;

        for (Book book : bookList) 
        {
            if (book.title().equalsIgnoreCase(keyword) || 
                book.author().equalsIgnoreCase(keyword)) 
            {
                IO.println("Book Found : " + book);
                found = true;
            }
        }

        if (!found) 
        {
            IO.println("No matching books found.");
        }
    }
}