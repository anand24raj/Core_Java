package com.core_java.Array;

// Working with Reference Type :
// Create Customer array to hold multiple Customer Objects (Manual insertion)

record Customer1(Integer id, String name) {}

public class ArrayEx09 
{
    public static void main(String[] args) 
    {
        Customer1 customers[] = new Customer1[4];

        customers[0] = new Customer1(111, "Scott");
        customers[1] = new Customer1(222, "Smith");
        customers[2] = new Customer1(333, "Alen");
        customers[3] = new Customer1(444, "John");

        IO.println("Printing Customer Objects :");

        for (Customer1 customer : customers) {
            IO.println(customer);
        }
    }
}