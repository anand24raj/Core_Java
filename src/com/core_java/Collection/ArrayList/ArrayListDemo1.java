package com.core_java.Collection.ArrayList;

import java.util.ArrayList;

// CRUD OPERATION
record Employee(Integer id, String name, Double salary) {
}

public class ArrayListDemo1 {
    public static void main(String[] args) {
	ArrayList<Employee> listOfEmployees = new ArrayList<>();

	// CREATE
	listOfEmployees.add(new Employee(101, "John", 50000D));
	listOfEmployees.add(new Employee(102, "Smith", 55000D));
	listOfEmployees.add(new Employee(103, "Alen", 48000D));
	listOfEmployees.add(new Employee(104, "David", 60000D));
	listOfEmployees.add(new Employee(105, "Black", 52000D));

	IO.println("Printing Original Data");
	for (Employee employee : listOfEmployees) {
	    IO.println(employee);
	}

	// READ (search Employee)
	int id = Integer.parseInt(IO.readln("Enter employee id to search: "));
	for (Employee employee : listOfEmployees) {
	    if (id == employee.id()) {
		IO.println(employee);
	    }
	}

	// UPDATE (set(int index))
	for (int i = 0; i < listOfEmployees.size(); i++) {
	    Employee emp = listOfEmployees.get(i);
	    if (emp.id() == 103) {
		listOfEmployees.set(i, new Employee(emp.id(), emp.name(), emp.salary() + 10000));
	    }
	}

	IO.println("Employee Record after updating the salary:");

	for (Employee employee : listOfEmployees) {
	    IO.println(employee);
	}

	// DELETE (removeIf())
	listOfEmployees.removeIf(emp -> emp.id() == 105);

	IO.println("Employee Record after Deleting:");
	for (Employee employee : listOfEmployees) {
	    IO.println(employee);
	}
    }
}