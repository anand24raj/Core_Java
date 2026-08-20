package com.nit.Array.StreamApi;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ArrayTostream 
{
    public static void main(String[] args) 
    {
        String[] cities = {"Hyderabad", "Ameerpet", "Pune", "Mumbai"};

        Stream<String> stream = Arrays.stream(cities);
        stream.forEach(str -> IO.println(str));

        IO.println("....................");

        int[] arr1 = {10, 20, 30, 40};
        IntStream intStream = Arrays.stream(arr1);
        intStream.forEach(n -> IO.println(n));

        IO.println("....................");

        long[] arr2 = {12L, 67L, 34L, 90L};
        LongStream longStream = Arrays.stream(arr2);
        longStream.forEach(n -> IO.println(n));

        IO.println("....................");

        double[] arr3 = {12D, 78.90, 23.89, 15D};
        DoubleStream doubleStream = Arrays.stream(arr3);
        doubleStream.forEach(n -> IO.println(n));
    }
}
