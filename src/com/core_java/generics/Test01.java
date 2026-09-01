package com.core_java.generics;

import java.util.ArrayList;

public class Test01 
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hyd");
        list.add("Bglr");
        list.add("Pune");
        list.add("Goa");

        for (int i = 0; i < list.size(); i++) 
        {
            String obj = (String) list.get(i); // Type casting is reqd
            IO.println(obj.toUpperCase());
        }
    }
}