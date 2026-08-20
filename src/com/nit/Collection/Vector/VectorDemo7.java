package com.nit.Collection.Vector;

import java.util.Vector;

record Customer(Integer id, String name, Double bill) 
{
	
}

public class VectorDemo7 
{
    public static void main(String[] args) 
    {
        Vector<Customer> listOfCustomers = new Vector<>();

        listOfCustomers.add(new Customer(101, "Scott", 120000D));
        listOfCustomers.add(new Customer(102, "Smith", 90000D));
        listOfCustomers.add(new Customer(103, "Raj", 150000D));
        listOfCustomers.add(new Customer(104, "Alen", 95000D));
        listOfCustomers.add(new Customer(105, "John", 78000D));
        listOfCustomers.add(new Customer(106, "Black", 125000D));
        listOfCustomers.add(new Customer(107, "Sanju", 160000D));

        IO.println("Original Data:");
        for(Customer customer : listOfCustomers)
        {
        		IO.print(customer);
        }

        IO.println("Retrieve only those customers whose bill is > 100000");

        listOfCustomers.stream()
                .filter(customer -> customer.bill() > 100000)
                .forEach(customer -> IO.println(customer.name()));
    }
}