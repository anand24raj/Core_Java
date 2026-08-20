package com.nit.Api_Method_Reference.arbitrary_ref;

import java.util.Arrays;

public class ArbitraryRefDemo1 
{
    public static void main(String[] args) 
    {
        Integer[] arr = {12, 90, 45, 23, 77};
        
        //Arrays.sort(arr, (first, second) -> first.compareTo(second));

        // Sorting using method reference 
        Arrays.sort(arr, Integer::compareTo);

        IO.println("Sorted Integer Array (Ascending):");

        for (Integer number : arr) 
        {
            IO.println(number);
        }

        IO.println("---------------------------");

        String[] fruits = {"Orange", "Pear", "Apple", "Mango", "Grapes"};
        
       // Arrays.sort(fruits, String::compareTo);

        // Sorting using lambda expression 
        Arrays.sort(fruits, (first, second) -> second.compareTo(first));

        IO.println("Sorted String Array (Descending):");
        
        for (String fruit : fruits) 
        {
            IO.println(fruit);
        }
    }
}
