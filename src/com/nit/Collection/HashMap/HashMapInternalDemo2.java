package com.nit.Collection.HashMap;

import java.util.HashMap;

record Product(Integer id, String name) {}

public class HashMapInternalDemo2
{
    public static void main(String[] args)
    {
        Product p1 = new Product(111, "Camera");
        Product p2 = new Product(111, "Camera");

        HashMap<Product, String> map = new HashMap<>();

        map.put(p1, "Hyderabad");
        map.put(p2, "Pune");

        IO.println(map.size());
        IO.println(map);
    }
}