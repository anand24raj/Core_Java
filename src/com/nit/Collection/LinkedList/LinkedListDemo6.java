package com.nit.Collection.LinkedList;

import java.util.LinkedList;

// Product record
record Product(Integer id, String name) {}

public class LinkedListDemo6 
{
    public static void main(String[] args) 
    {
        LinkedList<Product> listOfProduct = new LinkedList<>();

        listOfProduct.add(new Product(2, "ApplePhone"));
        listOfProduct.add(new Product(1, "VivoPhone"));
        listOfProduct.add(new Product(3, "Samsung"));

        // Retrieve the object based on the index
        Product product = listOfProduct.get(1);
        IO.println(product);

        IO.println("Sorting based on the ID:");
        listOfProduct.sort((p1, p2) -> p1.id().compareTo(p2.id()));
        listOfProduct.forEach(IO::println);
    }
}