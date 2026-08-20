package com.nit.Collection.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo5
{
    public static void main(String[] args)
    {
        // StringBuffer (not Comparable → need Comparator)
        TreeSet<StringBuffer> ts1 = new TreeSet<>();

        ts1.add(new StringBuffer("B"));
        ts1.add(new StringBuffer("A"));
        ts1.add(new StringBuffer("C"));

        IO.println(ts1);

        // StringBuilder
        TreeSet<StringBuilder> ts2 = new TreeSet<>((sb1, sb2) -> sb2.compareTo(sb1));

        ts2.add(new StringBuilder("B"));
        ts2.add(new StringBuilder("A"));
        ts2.add(new StringBuilder("C"));

        IO.println(ts2);
    }
}