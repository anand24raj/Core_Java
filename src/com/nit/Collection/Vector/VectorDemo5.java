package com.nit.Collection.Vector;

import java.util.Vector;

record Employee(Integer id, String name, Double salary) {

}

public class VectorDemo5 {
    public static void main(String[] args) {
	Vector<Employee> listOfEmployees = new Vector<>();

	listOfEmployees.add(new Employee(101, "Scott", 78890.90));
	listOfEmployees.add(new Employee(102, "Smith", 98890.90));
	listOfEmployees.add(new Employee(103, "John", 65890.90));
	listOfEmployees.add(new Employee(104, "Alen", 91890.90));
	listOfEmployees.add(new Employee(105, "Sanju", 99890.90));

	IO.println("Original Data:");
	for (Employee employee : listOfEmployees) {
	    IO.println(employee);
	}

	Integer id = Integer.valueOf(IO.readln("Enter the Employee id you want to delete : "));

	for (Employee employee : listOfEmployees) {
	    if (employee.id().equals(id)) {
		listOfEmployees.remove(employee);
		break;
	    }
	}

	IO.println("After deleting the data:");
	for (Employee employee : listOfEmployees) {
	    IO.println(employee);
	}

    }
}