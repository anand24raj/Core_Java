/*Q2) Create a record called Customer, which accepts id, name and bill as a component.

Create an ELC class CustomerComparator with main method.

Create a Customer array with dynamic size and dynamic array initialization using IO class. 

Sort the Customer object based on following criteria :

  a) By using Customer id
  b) By using Customer name
  c) By using Customer bill*/

package com.core_java.Array.Comparator;

import java.util.Arrays;

record Customer(int id, String name, double bill) 
{
	
}

// ELC Class
// Dynamic array creation
// Sorting based on id, name and bill

public class CustomerComparator 
{
     void main() 
    {
        int size = Integer.parseInt(IO.readln("Enter number of customers : "));

        Customer[] customers = new Customer[size];

        // Dynamic initialization
        for (int i = 0; i < size; i++) 
        {
            IO.println("Enter details for Customer " + (i + 1));

            int id = Integer.parseInt(IO.readln("Enter Customer Id : "));
            String name = IO.readln("Enter Customer Name : ");
            double bill = Double.parseDouble(IO.readln("Enter Customer Bill : "));

            customers[i] = new Customer(id, name, bill);
        }

        IO.println("Original Customer Data :");

        for (Customer c : customers) 
        {
            IO.println(c);
        }

        // a) Sorting by Customer Id

        Arrays.sort(customers,(c1, c2) -> Integer.compare(c1.id(), c2.id()));

        IO.println("Sorted based on Customer Id :");

        for (Customer c : customers) 
        {
            IO.println(c);
        }

        // b) Sorting by Customer Name

        Arrays.sort(customers,(c1, c2) -> c1.name().compareTo(c2.name()));

        IO.println("Sorted based on Customer Name :");

        for (Customer c : customers) 
        {
            IO.println(c);
        }

        // c) Sorting by Customer Bill

        Arrays.sort(customers,(c1, c2) -> Double.compare(c1.bill(), c2.bill()));

        IO.println("Sorted based on Customer Bill :");

        for (Customer c : customers) 
        {
            IO.println(c);
        }
    }
}