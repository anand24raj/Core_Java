package com.core_java.StreamApi;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo1 
{
    public static void main(String[] args) 
    {
        List<String> indPlayer = Arrays.asList("Surya", "Tilak", "Abhi", "Bumrah");
        List<String> nzPlayer = Arrays.asList("Rachin", "Sodhi", "Santner", "Mitchell");

        List<List<String>> nestedColl = Arrays.asList(indPlayer, nzPlayer);

        IO.println("Nested Collection :" + nestedColl);

        List<String> list2 = nestedColl
                .stream()
                .flatMap(list -> list.stream())
                .toList();

        IO.println("After flat map :" + list2);
    }
}