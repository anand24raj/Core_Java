package com.nit.Collection.MoreEx;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMethodDemo
{
    public static void main(String[] args)
    {
        TreeSet<Integer> times = new TreeSet<>();

        times.add(1205);
        times.add(1505);
        times.add(1545);
        times.add(1600);
        times.add(1830);
        times.add(2010);
        times.add(2100);

        SortedSet<Integer> sub = new TreeSet<>();
        
        sub = times.subSet(1545, 2100);
        IO.println("Using subSet(): " + sub);

        IO.println("First: " + sub.first());
        IO.println("Last: " + sub.last());

        sub = times.headSet(1545);
        IO.println("Using headSet(): " + sub);

        sub = times.tailSet(1545);
        IO.println("Using tailSet(): " + sub);
    }
}