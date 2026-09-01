package com.core_java.StreamApi.Testing;

import java.util.stream.Stream;

public class StreamTerminal 
{
    public static void main(String[] args) 
    {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);

        // First terminal operation
        stream.forEach(IO::println);

        IO.println("----------------------");

        // Stream cannot be reused, so create it again

        stream.filter(n -> n % 2 == 0)
              .forEach(IO::println);
    }
}