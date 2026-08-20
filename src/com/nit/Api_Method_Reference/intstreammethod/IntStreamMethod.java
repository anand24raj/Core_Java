package com.nit.Api_Method_Reference.intstreammethod;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamMethod 
{
    public static void main(String[] args) 
    {
        IntStream.range(1, 10)
                 .forEach(IO::println);

        IO.println("------------------------");
        int[] arr1 = {10, 20, 30, 40, 50};
        int sum = Arrays.stream(arr1).sum();
        IO.println("Sum of all the array elements: " + sum);

        IO.println("------------------------");
        IO.println("Average of all the array elements: ");
        int[] arr2 = {10, 20, 30, 40, 50};
        Arrays.stream(arr2)
              .average()
              .ifPresent(IO::println);

        IO.println("------------------------");
        IO.println("Min element value in the array: ");
        int[] arr3 = {10, 20, 30, 40, 50};
        Arrays.stream(arr3)
              .min()
              .ifPresent(IO::println);

        IO.println("------------------------");
        IO.println("Max element value in the array: ");
        int[] arr4 = {10, 20, 30, 40, 50};
        Arrays.stream(arr4)
              .max()
              .ifPresent(IO::println);

        IO.println("------------------------");
        IO.println("Total number of elements in the array: ");
        int[] arr5 = {10, 20, 30, 40, 50};
        long count = Arrays.stream(arr5).count();
        IO.println(count);
    }
}
