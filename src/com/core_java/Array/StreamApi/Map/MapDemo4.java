package com.core_java.Array.StreamApi.Map;

import java.util.Arrays;

// WAP to replace all the negative numbers of an array with e
public class MapDemo4 
{
    public static void main(String[] args) 
    {
        // Replace all negative Numbers with Zero
        int[] arr = {-9, 34, -1, -7, 67, 34};

        int[] array = Arrays.stream(arr).map(num -> num < 0 ? 0 : num).toArray();

        IO.println("Original Array ");
        IO.println(Arrays.toString(arr));

        IO.println("Array after replacing negative value : ");
        IO.println(Arrays.toString(array));
    }
}