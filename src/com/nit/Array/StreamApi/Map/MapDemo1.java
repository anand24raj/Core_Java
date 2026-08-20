package com.nit.Array.StreamApi.Map;

import java.util.Arrays;

// Take some fruits using array and return the length of the fruits
public class MapDemo1 
{
    public static void main(String[] args) 
    {
        String[] fruits = {"Apple", "Orange", "Pear", "Pomogranate"};

        Object[] array = Arrays.stream(fruits)
                .map(fruit -> fruit.length())
                .toArray();

        IO.println(Arrays.toString(array));
    }
}