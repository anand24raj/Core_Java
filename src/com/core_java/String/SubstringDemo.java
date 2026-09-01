package com.core_java.String;

public class SubstringDemo
{
    public static void main(String[] args) 
    {
        String str = "HYDERABAD";

        IO.println(str.substring(3));      // ERABAD
        IO.println(str.substring(2, 7));   // DERAB
        IO.println(str.substring(2, 2));   // empty

        IO.println(str.substring(0, 9));   // HYDERABAD
    }
}