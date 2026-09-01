package com.core_java.Array;

import java.util.Arrays;

// Program to merge two arrays into a single array

class Merger 
{
    public static int[] mergeTwoArray(int[] arr1, int[] arr2) 
    {
        int[] newArray = new int[arr1.length + arr2.length];

        int pos = 0;

        for (int element : arr1) 
        {
            newArray[pos++] = element;
        }

        for (int element : arr2) 
        {
            newArray[pos++] = element;
        }

        return newArray;
    }
}

public class ArrayEx26TwoArrayMerge 
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {11, 12, 13, 14, 15, 16};

        int[] mergeTwoArray = Merger.mergeTwoArray(arr1, arr2);

        IO.println("Array after merging : " + Arrays.toString(mergeTwoArray));
    }
}