package com.core_java.Collection.Vector;

import java.util.Collections;
import java.util.Vector;

// Record with Comparable implementation
record Product(Integer id, String name, Double price) implements Comparable<Product> 
{
    @Override
    public int compareTo(Product otherProduct) 
    {
        return Integer.compare(this.id(), otherProduct.id());
    }
}

public class VectorDemo2 
{
    public static void main(String[] args) 
    {
        Vector<Product> listOfProduct = new Vector<>();

        listOfProduct.add(new Product(111, "Harddisk", 24789D));
        listOfProduct.add(new Product(333, "Mouse", 1200D));
        listOfProduct.add(new Product(555, "Watch", 5000D));
        listOfProduct.add(new Product(222, "Laptop", 75000D));

        IO.println("Original Data:\n");
        for (Product product : listOfProduct) 
        {
            IO.println(product);
        }
        
        // Sorting based on ID
        Collections.sort(listOfProduct);

        IO.println("\nAfter sorting based on the ID:\n");
        for (Product product : listOfProduct) 
        {
            IO.println(product);
        }
    }
}