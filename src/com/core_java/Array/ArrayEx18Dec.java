package com.core_java.Array;

import java.util.Arrays;

// Sort Integer array in Descending order using Comparator

public class ArrayEx18Dec
{
    public static void main(String[] args) 
    {
        Integer[] arr = {12, 90, 56, 34};

        Arrays.sort(arr, (i1, i2) -> i2.compareTo(i1));

        IO.println("Array after Descending Sort :");
        IO.println(Arrays.toString(arr));
    }
}