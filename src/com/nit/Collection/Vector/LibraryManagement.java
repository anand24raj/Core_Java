/* Assignment :
----------------------
Develop a scenario based program by using Collections Framework for processing the Library Management System
using different available options like Display books in the Library, Issue a book, search a particular book in the library.

Create a record called Book.

Components :
 id : Integer
 title : String
 author : String
 
Create another BLC class Library which contains following non static 
methods :

1) Method Name     : displayAvailableBooks()
Argument           : 1 argument of type Vector<Book>
Return Type        : void
Access modifier    : public
In this method display all the available books in the Library.[See the Test cases for More Details]

2) Method Name     : issueBook()
Argument           : 2 arguments [Vector<Book>, IO io]
Return Type        : void
Access modifier    : public
In this method issueBook from the Library based on the id of the Book, If Book is available (based on the id) then remove() the Book from the Library otherwise give an error message  "Book with ID 103 not Found"
[See Test cases for More details]


3) Method Name     : searchBook()
Argument           : 2 arguments [Vector<Book>, IO io]
Return Type        : void
Access modifier    : public
In this method search a Book from the Library by using title OR author, If Book is available either by title OR Author then give a message "Book Found", If not available then give an error message "No matching books found."


Create an ELC class called LibraryManagement which contains main method.
Inside main method Create Vector class object to add books available in the library. [See the Test cases for Library Books] 

Inside main method display the following details as a Menu.
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :

Write Switch case with Scanner class to perform Various operation with
Library System.

Test Cases for Output :
------------------------
Test Case 1 :
-------------
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  Book[id=102, title=Adv Java, author=Mr Robert]
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  Book[id=104, title=Programming in C , author=Mr Denis]
Please Enter your Choice :


Test Case 2 :
-------------
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :

Please Enter your Choice :
2

Enter keyword to search by title or author: Core Java
Found: Book[id=101, title=Core Java, author=Mr James]
Please Enter your Choice :



Test Case 3 :
-------------
3

 Enter Book id which for Book issue :102
 Issued: Book[id=102, title=Adv Java, author=Mr Robert]
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  Book[id=104, title=Programming in C , author=Mr Denis]


Test Cases 4 :
--------------
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :
4
Thank you for Visiting..*/

package com.nit.Collection.Vector;

import java.util.Scanner;
import java.util.Vector;

public class LibraryManagement 
{
    public static void main(String[] args) 
    {
        Vector<Book> bookList = new Vector<>();
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        bookList.add(new Book(101, "Core Java", "Mr James"));
        bookList.add(new Book(102, "Adv Java", "Mr Robert"));
        bookList.add(new Book(103, "Head First Java", "Miss Kathy Sierra"));
        bookList.add(new Book(104, "Programming in C", "Mr Denis"));

        while(true)
        {
            IO.println("\nSelect from the Menu : ");
            IO.println("1) Display Books Available in the Library");
            IO.println("2) Search a Book in the Library");
            IO.println("3) Issue a Book from the Library");
            IO.println("4) Exit from the application");

            int choice = Integer.parseInt(IO.readln("Please Enter your Choice : "));

            switch (choice) 
            {
                case 1 -> library.displayAvailableBooks(bookList);

                case 2 -> library.searchBook(bookList, sc);

                case 3 -> library.issueBook(bookList, sc);

                case 4 -> {
                    IO.println("Thank you for Visiting..");
                    sc.close();
                    return;   // exit program
                }

                default -> IO.println("Invalid Choice. Please select between 1 and 4.");
            }
        }
    }
}