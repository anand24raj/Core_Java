package com.nit.Array;

import java.util.Arrays;

// Manual Sorting using Nested Loop (Ascending Order)

public class ArrayEx21Asc 
{
    public static void main(String[] args) 
    {
        int[] arr = {9, 5, 2, 8, 4, 7, 10};

        IO.println("Original Array : " + Arrays.toString(arr));

        int temp;

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        IO.println("Array after Sorting : " + Arrays.toString(arr));
    }
}