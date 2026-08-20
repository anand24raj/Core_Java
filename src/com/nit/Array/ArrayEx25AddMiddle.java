package com.nit.Array;

import java.util.Arrays;

// Insert a new element in the array at middle position

class InsertAtMiddle 
{
    public static int[] insertInMiddle(int[] arr, int element) 
    {
        int[] newArray = new int[arr.length + 1];

        int middle = arr.length / 2;

        for (int i = 0; i < middle; i++) 
        {
            newArray[i] = arr[i];
        }

        newArray[middle] = element;

        for (int i = middle; i < arr.length; i++) 
        {
            newArray[i + 1] = arr[i];
        }

        return newArray;
    }
}

public class ArrayEx25AddMiddle 
{
    public static void main(String[] args) 
    {
        int val[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        IO.println("Original Array : " + Arrays.toString(val));

        int[] inMiddle = InsertAtMiddle.insertInMiddle(val, 100);

        IO.println("Array after insertion : " + Arrays.toString(inMiddle));
    }
}