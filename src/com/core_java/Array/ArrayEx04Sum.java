package com.core_java.Array;

//Calculates total sum of array using  for-loop.

public class ArrayEx04Sum 
{
    public static void main(String[] args) 
    {

        int[] arr = {10, 20, 30, 40, 50, 60};
        int sum = 0;

        for (int x : arr)
            sum = sum + x;

        IO.println("Sum is :" + sum);
    }
}