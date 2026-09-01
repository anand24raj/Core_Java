package com.core_java.Array.StreamApi.OptionalDemo;

import java.util.Optional;

public class OptionalDemo2 
{
    public static void main(String[] args) 
    {
        Integer i = 12;

        Optional<Integer> optional = Optional.of(i); // non null value

        if (optional.isPresent()) 
        {
            IO.println(optional.get());
        } 
        else 
        {
        	System.err.println("No Value");
        }
    }
}