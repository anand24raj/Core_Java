package com.nit.Collection.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2
{
    public static void main(String[] args)
    {
        TreeSet<String> ts2 = new TreeSet<>();

        ts2.add("Mango");
        ts2.add("Grapes");
        ts2.add("Apple");
        ts2.add("Orange");

        IO.println("In Ascending Order :");

        Iterator<String> itr = ts2.iterator();
        while (itr.hasNext())
        {
            IO.println(itr.next());
        }

        IO.println("In Descending Order :");

        Iterator<String> descItr = ts2.descendingIterator();
        while (descItr.hasNext())
        {
            IO.println(descItr.next());
        }
    }
}