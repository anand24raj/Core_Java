package com.nit.Array.Comparable;

import java.util.Arrays;

// Demonstration of Comparable Interface
// Sorting Employee array based on id

public class EmployeeComparable 
{
    public static void main(String[] args) 
    {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee(222, "Scott", 42000D);
        employees[1] = new Employee(111, "Zuber", 48000D);
        employees[2] = new Employee(333, "Aryan", 41000D);

        IO.println("Original Data :");

        for (Employee employee : employees) 
        {
            IO.println(employee);
        }

        // Sorting using Comparable (Natural Ordering)
        Arrays.sort(employees);

        IO.println("Employee Data, Sorted based on the Id :");

        for (Employee employee : employees) 
        {
            IO.println(employee);
        }
    }
}