package com.nit.Array.Comparable;

import java.util.Arrays;
import java.util.Comparator;

// Demonstration of Comparator Interface
// Sorting based on Id, Name and Price

//Product Record

record Product(Integer id, String name, Double price) 
{
	
}

public class ProductComparator 
{
    public static void main(String[] args) 
    {
        Product[] products = new Product[3];

        products[0] = new Product(333, "Mobile", 40890D);
        products[1] = new Product(111, "Laptop", 75890D);
        products[2] = new Product(222, "Camera", 29890D);

        IO.println("Original Data :");

        for (Product product : products) 
        {
            IO.println(product);
        }

        // 1️ Anonymous Inner Class (Sort by Id)

        Comparator<Product> cmpId = new Comparator<Product>() 
        {
            @Override
            public int compare(Product p1, Product p2) 
            {
                return Integer.compare(p1.id(), p2.id());
            }
        };

        Arrays.sort(products, cmpId);

        IO.println("Sorted Product Data based on Id :");

        for (Product product : products) 
        {
            IO.println(product);
        }

        // 2️ Lambda Expression (Sort by Name)

        Comparator<Product> cmpName = (p1, p2) -> p1.name().compareTo(p2.name());

        Arrays.sort(products, cmpName);

        IO.println("Sorted Product Data based on Name :");

        for (Product product : products) 
        {
            IO.println(product);
        }

        // 3️ Direct Lambda (Sort by Price)

        Arrays.sort(products,(p1, p2) -> Double.compare(p1.price(), p2.price()));

        IO.println("Sorted Product Data based on Price :");

        for (Product product : products) 
        {
            IO.println(product);
        }
    }
}