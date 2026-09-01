package com.core_java.Collection.TreeMap;

import java.util.TreeMap;

record Product(Integer id, String name) implements Comparable<Product>
{
    @Override
    public int compareTo(Product p2)
    {
        return this.name().compareTo(p2.name());
    }
}

public class TreeMapDemo3
{
    public static void main(String[] args)
    {
        TreeMap<Product, String> map = new TreeMap<>();

        map.put(new Product(222, "Mobile"), "Hyderabad");
        map.put(new Product(111, "Laptop"), "Chennai");
        map.put(new Product(333, "Camera"), "Pune");

        map.forEach((k, v) -> IO.println(k + " : " + v));
    }
}