package com.core_java.Collection.MoreEx;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo
{
    public static void main(String[] args)
    {
        NavigableSet<Integer> ns = new TreeSet<>();

        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

        IO.println("lower(3): " + ns.lower(3));
        IO.println("floor(3): " + ns.floor(3));
        IO.println("higher(3): " + ns.higher(3));
        IO.println("ceiling(3): " + ns.ceiling(3));
    }
}