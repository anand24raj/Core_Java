package com.nit.generics;

import java.util.*;

public class Test03 
{
    public static void main(String[] args) 
    {
        ArrayList<String> al = new ArrayList<>(); // Generic type

        al.add("Ravi");
        al.add("Ajay");
        al.add("Vijay");

        for (int i = 0; i < al.size(); i++) 
        {
            String name = al.get(i); // no type casting required
            IO.println(name.toUpperCase());
        }
    }
}