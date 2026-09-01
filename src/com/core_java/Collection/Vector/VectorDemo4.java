package com.core_java.Collection.Vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorDemo4 
{
    public static void main(String[] args) 
    {
        Vector<Integer> listOfNumber = new Vector<>();

        listOfNumber.add(67);
        listOfNumber.add(34);
        listOfNumber.add(99);
        listOfNumber.add(12);
        listOfNumber.add(29);

        listOfNumber.forEach(IO::println);

        listOfNumber.sort(Integer::compareTo);

        IO.println("After sorting in ascending order");
        listOfNumber.forEach(IO::println);

        IO.println("Maximum Element : " + Collections.max(listOfNumber));
        IO.println("Minimum Element : " + Collections.min(listOfNumber));

        IO.println("Printing the Data in reverse order:");
        Collections.reverse(listOfNumber);
        listOfNumber.forEach(IO::println);

        Object[] array = listOfNumber.toArray();
        IO.println(Arrays.toString(array));
    }
}