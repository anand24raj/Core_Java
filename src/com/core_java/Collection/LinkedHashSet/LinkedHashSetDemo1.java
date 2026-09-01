package com.core_java.Collection.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Ravi");
        lhs.add("Vijay");
        lhs.add("Ravi");   // duplicate
        lhs.add("Ajay");
        lhs.add("Pawan");
        lhs.add("Shiva");
        lhs.add(null);
        lhs.add("Ganesh");

        lhs.forEach(str -> IO.println(str));
    }
}