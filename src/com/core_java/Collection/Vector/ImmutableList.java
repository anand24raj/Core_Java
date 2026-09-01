package com.core_java.Collection.Vector;

import java.util.List;

public class ImmutableList 
{
    public static void main(String[] args) 
    {
        List<Integer> listOfNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        // listOfNumbers.add(12);     // UnsupportedOperationException
        // listOfNumbers.remove(0);   // UnsupportedOperationException
          
        //listOfNumbers.set(0, 100); // UnsupportedOperationException

        listOfNumbers.forEach(IO::println);
    }
}