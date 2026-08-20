package com.nit.Array.StreamApi.OptionalDemo;

import java.util.Optional;

public class OptionalDemo1 
{
    public static void main(String[] args) 
    {
        String str = null;

        Optional<String> container = Optional.ofNullable(str);

        if (container.isPresent()) 
        {
            IO.println(container.get());
        } 
        else 
        {
            System.err.println("No Value is available in the container");
        }
    }
}