package com.nit.Collection.Vector;

import java.util.Arrays;
import java.util.List;

public class FixedLengthArray 
{
    public static void main(String[] args) 
    {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // listOfNumbers.add(9);     // UnsupportedOperationException
        // listOfNumbers.remove(0); // UnsupportedOperationException

        //  Allowed (modification allowed)
        listOfNumbers.set(0, 100);

        listOfNumbers.forEach(IO::println);
    }
}