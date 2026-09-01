package com.core_java.String;

public class IsEmptyAndIsBlank 
{
    public static void main(String[] args) 
    {
        String s1 = "James Gosling";
        IO.println(s1.isEmpty()); // false

        s1 = "";
        IO.println(s1.isEmpty()); // true

        IO.println(".............");

        String s2 = " ";
        IO.println(s2.isBlank()); // true

        s2 = "\n\t";
        IO.println(s2.isBlank()); // true

        s2 = "hello";
        IO.println(s2.isBlank()); // false
    }
}