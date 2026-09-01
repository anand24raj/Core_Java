package com.core_java.Collection.Vector;

import java.util.Vector;

public class VectorDemo1 
{
    public static void main(String[] args) 
    {
        Vector<Integer> listOfNumbers = new Vector<>();

        listOfNumbers.add(100);
        listOfNumbers.add(200);
        listOfNumbers.add(300);
        listOfNumbers.add(400);
        listOfNumbers.add(500);

        // Adding all elements of Vector
        int sum = 0;

        for (int number : listOfNumbers) 
        {
            sum = sum + number;
        }

        IO.println("Sum is : " + sum);
    }
}