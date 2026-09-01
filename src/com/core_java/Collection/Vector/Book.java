/*Develop a scenario based program by using Collections Framework for processing the Library Management System
using different available options like Display books in the Library, Issue a book, search a particular book in the library.

Create a record called Book.

Components :
 id : Integer
 title : String
 author : String*/

package com.core_java.Collection.Vector;

public record Book(Integer id, String title, String author) 
{
	@Override
	public String toString() 
	{
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
	
}
