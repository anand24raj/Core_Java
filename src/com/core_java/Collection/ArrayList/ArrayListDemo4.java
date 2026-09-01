package com.core_java.Collection.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo4 
{
    public static void main(String[] args) 
    {
        List<String> indPlayer = Arrays.asList("Abhi", "Ishan", "Tilak", "Sanju");
        List<String> engPlayer = Arrays.asList("Butler", "Salt", "Brook", "Archer");

        List<List<String>> nestedColl = Arrays.asList(indPlayer, engPlayer);

        IO.println("Nested Collection");
        IO.println(nestedColl);

        // Converting nested collection into single collection
        IO.println("After using flat map");

        List<String> flattening = nestedColl.stream()
                .flatMap(list -> list.stream())
                .toList();

        IO.println(flattening);
    }
}