/*Assignment 02 :
---------------
Develop an array for Custom class object.

Coding requirement :
--------------------
Create a BLC class called Employee.

Attributes/Properties/Fields [tightly encapsulated]

id, name and salary

Take a parameetrized constructor to initialize all the fields.

Generate toString() method.

Take an ELC class called EmployeeArrayDemo with main method.

Create Scanner class object to initialize employee array dynamically. [User choice]

Take a for loop to initialize the employee array with user input.

Take a forEach() loop to retrieve and pring array data.

Sample Output :
----------------
Enter number of employees: 3

Enter details for Employee 1:
Enter ID: 111
Enter Name: Scott
Enter Salary: 45789

Enter details for Employee 2:
Enter ID: 222
Enter Name: Smith
Enter Salary: 78908

Enter details for Employee 3:
Enter ID: 333
Enter Name: Alen
Enter Salary: 99567

===== Employee Details =====
Employee [id=111, name=Scott, salary=45789.0]
Employee [id=222, name=Smith, salary=78908.0]
Employee [id=333, name=Alen, salary=99567.0]

==========================================================================================*/

package com.core_java.Array;

import java.util.Scanner;

class Employee
{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() 
	{
		return "student [id=" + id + ", name=" + name + ", marks=" + salary + "]";
	}	
}

public class EmployeeDemo
{
	void main() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee size ::");
		int size = Integer.parseInt(sc.nextLine());
		
		Employee emp[] = new Employee[size];
		
		for(int i=0; i<size; i++) 
		{
			System.out.print("Enter Employee ID :: ");
			int eid = Integer.parseInt(sc.nextLine());
			
			System.out.print("Enter Employee Name :: ");
			String ename = sc.nextLine();
			
			System.out.print("Enter Employee salary :: ");
			double esalary = Double.parseDouble(sc.nextLine());
			
			emp[i] = new Employee(eid, ename, esalary);
		}

		for(Employee emps : emp) 
		{
			System.out.println(emps);
		}
		sc.close();
	}
}
