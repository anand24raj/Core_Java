package com.core_java.StreamApi.peek;

import java.util.Arrays;
import java.util.List;

public class PeekDemo1 
{
    public static void main(String[] args) 
    {
        List<String> names = Arrays.asList("Ravi", "Scott", "Raj", "Smith");

        List<String> collect = names.stream()
                .filter(name -> name.length() > 4)
                .peek(name -> IO.println("Filtered: " + name.toLowerCase()))
                .map(str -> str.toUpperCase())
                .peek(name -> IO.println("Mapped: " + name))
                .toList();

        IO.println(collect); // [SCOTT, SMITH]

        IO.println("-------------");

        IO.println(names); // original list unchanged
    }
}