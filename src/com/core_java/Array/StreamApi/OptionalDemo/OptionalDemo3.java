package com.core_java.Array.StreamApi.OptionalDemo;

import java.util.Optional;

public class OptionalDemo3 
{
    public static void main(String[] args) 
    {
        String s1 = null;

        Optional<String> contr = Optional.ofNullable(s1);

        IO.println(contr.get());  // This will throw NoSuchElementException
    }
}