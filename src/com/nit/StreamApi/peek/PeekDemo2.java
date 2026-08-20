package com.nit.StreamApi.peek;

import java.util.Arrays;
import java.util.List;

public class PeekDemo2 
{
    public static void main(String[] args) 
    {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .peek(n -> IO.println("Even number: " + n))
                .map(n -> n * 2)
                .peek(n -> IO.println("Doubled value: " + n))
                .toList();

        IO.println("Final Result: " + result);
    }
}