package com.core_java.Array;

// Finding duplicate elements in an array

public class ArrayEx23Duplicate 
{
    public static void main(String[] args) 
    {
        int[] arr = {12, 4, 6, 7, 9, 2, 4, 2};

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    IO.println("Duplicate element is : " + arr[j]);
                }
            }
        }
    }
}