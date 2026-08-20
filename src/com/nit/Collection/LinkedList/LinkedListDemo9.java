package com.nit.Collection.LinkedList;

import java.util.LinkedList;
import java.util.List;

record Customer(Integer id, String name) {}

public class LinkedListDemo9 
{
    public static void main(String[] args) 
    {
        Customer customer = getCustomerObject().get(0);
        IO.println(customer);
    }

    // Method return type can also be type safe
    public static List<Customer> getCustomerObject() 
    {
        Customer c1 = new Customer(111, "Scott");
        Customer c2 = new Customer(222, "Alen");
        Customer c3 = new Customer(333, "Smith");

        List<Customer> list = new LinkedList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);

        return list;
    }
}