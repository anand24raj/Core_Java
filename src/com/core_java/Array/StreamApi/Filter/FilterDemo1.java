package com.core_java.Array.StreamApi.Filter;

import java.util.Arrays;

// Q1) Retrieve all the even number from Array by removing the duplicates and provide sorting in ascending using Stream API
public class FilterDemo1 
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 15, 20, 25, 30, 35, 39, 41, 15, 25, 35};

        int[] array = Arrays.stream(arr)
                .distinct()
                .sorted()
                .filter(num -> num % 2 == 0)
                .toArray();

        IO.println(Arrays.toString(array));
    }
}
