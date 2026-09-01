package com.core_java.Array.StreamApi.Map;

import java.util.Arrays;

// WAP to find the cube of all the even number of the Array.
public class MapDemo3 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};

        Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .map(n -> n * n * n)
                .forEach(IO::println);
    }
}