package com.core_java.generics;

import java.util.*;

public class Test02 
{
    public static void main(String[] args) 
    {
        ArrayList<Comparable> t = new ArrayList<>(); // raw type
        t.add("alpha");
        t.add("beta");

        for (int i = 0; i < t.size(); i++) 
        {
            String str = (String) t.get(i);
            IO.println(str);
        }

        t.add(1234);
        t.add(1256);

        for (int i = 0; i < t.size(); i++) 
        {
            try {
                String obj = (String) t.get(i); // ClassCastException possible
                IO.println(obj);
            } catch (Exception e) {
                IO.println("Type casting issue: " + e);
            }
        }
    }
}