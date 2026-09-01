package com.core_java.Array.StreamApi.Map;

import java.util.Arrays;

// WAP to extract first character from the given string Array
public class MapDemo5 
{
    public static void main(String[] args) 
    {
        String[] names = {"Jaya", "Arnav", "Vishal", "Ankita"};

        Object[] array = Arrays.stream(names)
                .map(name -> name.charAt(0))
                .toArray();

        IO.println(Arrays.toString(array));
    }
}