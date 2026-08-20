package com.nit.StreamApi.Testing;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapDemo2 
{
    public static void main(String[] args) 
    {
        String str[] = {"Scott", "Aryan", "Smith", "Alen"};

        Object[] array = Arrays.stream(str)
                .flatMap(name -> Stream.of(name.charAt(0)))
                .toArray();

        IO.println(Arrays.toString(array));
    }
}