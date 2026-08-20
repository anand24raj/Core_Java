package com.nit.Array.StreamApi.OptionalDemo;

import java.util.Optional;

public class OptionalDemo4 
{
    public static void main(String[] args) 
    {
        String s1 = "Java";
        Optional<String> contr = Optional.ofNullable(s1);

        String orElse = contr.orElse("No value is available");
        IO.println(orElse);

        IO.println("....................");

        Integer x = 12;
        Optional<Integer> optional = Optional.ofNullable(x);
        optional.ifPresent(IO::println);
    }
}