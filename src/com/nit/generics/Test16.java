package com.nit.generics;

public class Test16 
{
    public static void main(String[] args)
    {
        Integer[] intArr = {10, 20, 30, 40, 50};
        printArray(intArr);

        IO.println("----------");

        String[] cities = {"Hyderabad", "Bangalore", "Mumbai", "Kolkata"};
        printArray(cities);
    }

    // Generic Method
    public static <T> void printArray(T[] array) 
    {
        for (T element : array) 
        {
            IO.println(element);
        }
    }
}