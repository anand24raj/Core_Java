package com.core_java.String;

public class ReplaceDemo 
{
    public static void main(String[] args)
    {
        String s1 = "ABABABABABAB";
        IO.println("Original String " + s1);
        
        s1 = s1.replace('B', 'b');
        IO.println("After replacement " + s1);
        
        IO.println("-----------------");

        String s2 = "Manager";
        String replace = s2.replace("Man", "Dam");

        IO.println(replace);
    }
}