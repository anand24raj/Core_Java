package com.nit.StreamApi.limit_skip_demo;

import java.util.stream.Stream;

public class LimitAndSkipDemo1
{
    public static void main(String[] args) 
    {
        Stream<String> streamOfPlayers = Stream.of("Rohit", "Virat", "Surya", "Bumrah", "Rahul", "Yuvraj" );

        streamOfPlayers
                .limit(3)
                .forEach(IO::println);

        IO.println("----------------------");

        Stream<String> streamOfName = Stream.of("Scott", "Smith", "Alen", "Black", "John", "King");

        streamOfName.skip(4).forEach(IO::println);
    }
}
