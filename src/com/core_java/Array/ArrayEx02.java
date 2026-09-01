package com.core_java.Array;

import java.util.Arrays;

//Creating 1D array by using various type and printing data

public class ArrayEx02 
{
    public static void main(String[] args) 
    {
        int[] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        // Fetching the data by using ordinary for loop
        
        for (int i = 0; i < arr1.length; i++)
            IO.println(arr1[i]);

        int[] arr2 = new int[]{100, 200, 300};
        
        //Using for each() loop
       
        for (int x : arr2)
            IO.println(x);

        int[] arr3 = {1000, 2000, 3000};
        IO.println(Arrays.toString(arr3));
    }
}