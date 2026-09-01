package com.core_java.Collection.WeakHashMap;

import java.util.WeakHashMap;

record Product(Integer id, String name)
{
    @Override
    public void finalize() 
    {
        IO.println("Product Object is eligible for GC");
    }
}

public class WeakHashMapDemo1
{
    public static void main(String[] args) // user thread
    {
        Product p1 = new Product(111, "Laptop");

        WeakHashMap<Product, String> map = new WeakHashMap<>();

        map.put(p1, "Hyderabad");

        IO.println(map);

        p1 = null;

        System.gc(); // daemon thread

        try
        {
            Thread.sleep(5000); // wait for GC
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        IO.println(map); // {}
    }
}