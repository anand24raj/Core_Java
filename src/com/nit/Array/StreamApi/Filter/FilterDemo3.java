package com.nit.Array.StreamApi.Filter;

import java.util.Arrays;

//Q3) WAP to print all the array elements which are divisible by 3 and 5
public class FilterDemo3 
{
 public static void main(String[] args) 
 {
     Integer[] numbers = {15, 20, 30, 45, 60, 75, 90, 100};

     // Filtering numbers divisible by both 3 and 5
     Object[] array = Arrays.stream(numbers)
             .filter(n -> n % 3 == 0 && n % 5 == 0).toArray();

     IO.println(Arrays.toString(array));
 }
}
