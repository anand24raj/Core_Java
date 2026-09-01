package com.core_java.Array;

// Finding the unique elements in the array

public class ArrayEx27UniqueElement 
{
    public static void main(String[] args) 
    {
        int[] arr = {4, 5, 6, 4, 7, 5, 8};

        IO.println("Unique elements:");

        for (int i = 0; i < arr.length; i++) 
        {
            boolean isUnique = true;

            for (int j = 0; j < arr.length; j++) 
            {
                if (i != j && arr[i] == arr[j]) 
                {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) 
            {
                IO.println(arr[i]);
            }
        }
    }
}