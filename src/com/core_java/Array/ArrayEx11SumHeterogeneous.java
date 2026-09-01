package com.core_java.Array;

import java.util.Arrays;

// Object array using literal (Heterogeneous data types)
// Adding all Integer values using instanceof

public class ArrayEx11SumHeterogeneous 
{
    public static void main(String[] args) 
    {
        Object obj[] = {12, 90.89, 'A', true, "NIT"};

        IO.println("Printing Heterogeneous Objects types of data :");
        IO.println(Arrays.toString(obj));
        IO.println("----------------------------");

        // Adding all integer values from object array
        Object arr[] = {12, 90.89, 'A', true, "NIT", 24, 100, 14};

        int sum = 0;

        for (Object x : arr) 
        {
            if (x instanceof Integer) 
            {
                sum = sum + (Integer) x;
            }
        }

        IO.println("Sum of all the integers : " + sum);
    }
}