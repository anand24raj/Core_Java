package com.core_java.Array.Comparator;

import java.util.Arrays;

// Descending sorting using Comparator

public class DescendingComparator 
{
    public static void main(String[] args) 
    {
        String[] cities = {"Hyd", "Pune", "BBSR", "Goa"};

        IO.println("Original Data : " + Arrays.toString(cities));

        // Descending order
        Arrays.sort(cities, (s1, s2) -> s2.compareTo(s1));

        IO.println("Sorted Data (Descending) : " + Arrays.toString(cities));
    }
}