package com.core_java.Collection.Vector;

import java.util.Vector;

public class VectorDemo3 
{
    public static void main(String[] args) 
    {
        Vector<Integer> listOfNumbers = new Vector<>(100, 10);

        for (int i = 0; i < 100; i++) 
        {
            listOfNumbers.add(i);
        }

        IO.println("Capacity is : " + listOfNumbers.capacity());
        IO.println("Size is : " + listOfNumbers.size());

        listOfNumbers.add(999);

        IO.println("Capacity is : " + listOfNumbers.capacity());
        IO.println("Size is : " + listOfNumbers.size());
    }
}