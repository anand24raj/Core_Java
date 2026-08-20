package com.nit.Array.StreamApi.Map;

import java.util.Arrays;

// WAP to add number 5 to each element of the array
public class MapDemo2 
{
    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40, 50};

        IO.println("Original Array : " + Arrays.toString(arr));

        Arrays.stream(arr)
                .map(element -> element + 5)
                .forEach(IO::println);
    }
}