package com.nit.Array;

// Create Book Object to access Book class properties through Book array index

class Book 
{
    String title;
    String author;
}

public class ArrayEx13Book 
{
    public static void main(String[] args) 
    {
        Book books[] = new Book[3];

        books[0] = new Book();
        books[1] = new Book();
        books[2] = new Book();

        books[0].title = "Java";
        books[0].author = "James Gosling";

        books[1].title =  "C";
        books[1].author = "Kishore Sir";

        books[2].title = "Adv Java";
        books[2].author = "Hari Krishna Sir";

        int index = 0;

        while (index < books.length) 
        {

            IO.println(books[index].title);
            IO.println(" by ");
            IO.println(books[index].author);
            IO.println("-------------------");

            index++;
        }
    }
}