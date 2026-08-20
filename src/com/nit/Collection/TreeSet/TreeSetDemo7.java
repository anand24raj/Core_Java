package com.nit.Collection.TreeSet;

import java.util.TreeSet;

record Product(Integer id, String name, Double price) {}

public class TreeSetDemo7
{
    public static void main(String[] args)
    {
        TreeSet<Product> ts1 =
                new TreeSet<>((p1, p2) -> p1.id().compareTo(p2.id()));

        ts1.add(new Product(333, "Mobile", 56789D));
        ts1.add(new Product(111, "Laptop", 46789D));
        ts1.add(new Product(222, "Camera", 96789D));

        IO.println("Sorting based on the Id :");
        ts1.forEach(IO::println);

        TreeSet<Product> ts2 =
                new TreeSet<>((p1, p2) -> Double.compare(p1.price(), p2.price()));

        ts2.add(new Product(333, "Mobile", 56789D));
        ts2.add(new Product(111, "Laptop", 46789D));
        ts2.add(new Product(222, "Camera", 96789D));

        IO.println("Sorting based on the Price :");
        ts2.forEach(IO::println);
    }
}