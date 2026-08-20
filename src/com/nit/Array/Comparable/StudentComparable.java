/*Q1) Create a record called Student, which accepts id, name and marks as a component.

Create an ELC class StudentComparable with main method.

Create a Student array with dynamic size and dynamic array initialization using IO class
Insert at-least 5 Student Object.

Sort the Student Object based on Student Marks.*/

package com.nit.Array.Comparable;

import java.util.Arrays;

//Record Student implementing Comparable
//Natural sorting based on Student Marks

record Student(int id, String name, double marks)implements Comparable<Student> 
{
 @Override
 public int compareTo(Student s2) 
 {
     // Sorting based on marks (Ascending Order)
     return Double.compare(this.marks(), s2.marks());
 }
}

//ELC Class
//Dynamic Student array creation
//Sorting based on Student Marks using Comparable

public class StudentComparable 
{
	void main() 
	{
	     int size = Integer.parseInt(IO.readln("Enter number of Students (minimum 5) : "));
	
	     if (size < 5) 
	     {
	         IO.println("Please enter at least 5 students.");
	         return;
	     }
	
	     Student[] students = new Student[size];
	
	     // Dynamic initialization
	     for (int i = 0; i < size; i++) 
	     {
	         IO.println("Enter details for Student " + (i + 1));
	
	         int id = Integer.parseInt(IO.readln("Enter Student Id : "));
	         String name = IO.readln("Enter Student Name : ");
	         double marks = Double.parseDouble(IO.readln("Enter Student Marks : "));
	
	         students[i] = new Student(id, name, marks);
	     }
	
	     IO.println("Original Student Data :");
	
	     for (Student s : students) 
	     {
	         IO.println(s);
	     }
	
	     // Sorting using Comparable (based on marks)
	     Arrays.sort(students);
	
	     IO.println("Student Data Sorted Based on Marks (Ascending) :");
	
	     for (Student s : students) 
	     {
	         IO.println(s);
	     }
	}
}
