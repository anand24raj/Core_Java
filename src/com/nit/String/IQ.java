package com.nit.String;

public class IQ 
{
    public static void main(String[] args) 
    {

        String s1 = "Java";
        String s2 = new String("Java");

        IO.println(s1 == s2);       // false
        IO.println(s1.equals(s2));  // true
    }
}