package com.core_java.Collection.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo8 
{
    public static void main(String[] args) 
    {
        ArrayList<String> original = new ArrayList<>();

        original.add("BCA");
        original.add("MCA");
        original.add("BBA");
        original.add("B Tech");

        IO.println("Copy the data by using clone() method and Copy Constructor:");

        @SuppressWarnings("unchecked")
        ArrayList<String> cloned = (ArrayList<String>) original.clone();

        IO.println("Data by using clone() method");
        IO.println(cloned);

        ArrayList<String> copyCons = new ArrayList<>(original);

        IO.println("Data by using Copy Constructor");
        IO.println(copyCons);
    }
}