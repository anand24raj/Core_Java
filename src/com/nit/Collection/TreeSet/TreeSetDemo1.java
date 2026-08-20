package com.nit.Collection.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo1
{
    public static void main(String[] args)
    {
        TreeSet<Object> ts1 = new TreeSet<>();

        ts1.add(9);
        ts1.add(1); // compareTo()
        ts1.add(5);
        ts1.add(4);
        ts1.add(2);

        // ts1.add(null); // NPE
        // ts1.add(true); // ClassCastException

        IO.println(ts1);
    }
}