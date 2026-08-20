package com.nit.Collection.ArrayList;

//Program on ArrayList that contains null values as well as we can pass
//the element based on the index position

import java.util.ArrayList;

public class ArrayListDemo6 
{
    public static void main(String[] args) 
    {
        ArrayList<Object> al = new ArrayList<>(); // Generic type

        al.add(12);
        al.add("Ravi");
        al.add(12);
        al.add(3, "Hyderabad");
        al.add(1, "Naresh");
        al.add(null);
        al.add(11);

        IO.println(al); // Output
    }
}