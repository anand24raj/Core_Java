/*Assignment 01 :
---------------
Develop an array for Custom class object.

Coding requirement :
--------------------
Create a BLC class called Student.

Attributes/Properties/Fields [tightly encapsulated]

id, name and marks

Take a parameetrized constructor to initialize all the fields.

Generate toString() method.

Take an ELC class called StudentArrayDemo with main method.

Create Student array with size 3 manually.

Assign Student objects to array elements using index manually.

Take a forEach() loop to retrieve and pring array data.

Sample Output :
----------------
Student [id=101, name=Ravi, marks=89.5]
Student [id=102, name=Anita, marks=92.0]
Student [id=103, name=Kiran, marks=85.75]

===========================================================================================*/

package com.core_java.Array;

import java.util.Scanner;

record Student(int id,String name,double marks)
{
	
}

//class Student
//{
//	int id;
//	String name;
//	double marks;
//	
//	public Student(int id, String name, double marks)
//	{
//		this.id = id;
//		this.name = name;
//		this.marks = marks;
//	}
//
//	@Override
//	public String toString() 
//	{
//		return "student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
//	}	
//}

public class StudentDemo
{
	void main() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Student size ::");
		int size = Integer.parseInt(sc.nextLine());
		
		Student st[] = new Student[size];
		
		for(int i=0; i<size; i++) 
		{
			System.out.print("Enter Student ID :: ");
			int sid = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter Student Name :: ");
			String sname = sc.nextLine();
			
			System.out.print("Enter Student Marks :: ");
			double smarks = Double.parseDouble(sc.nextLine());
			
			st[i] = new Student(sid, sname, smarks);
		}

		for(Student std:st) 
		{
			System.out.println(std);
		}
		sc.close();
	}
}