package com.core_java.String;

public class SplitEachWord 
{
    public static void main(String[] args) 
    {
        String s1 = "Hyderabad is a nice city";
        String[] words = s1.split(" ");

        for (String word : words) 
        {
            IO.println(word);
        }

        IO.println("...............");
        
        String s2 = "Hyderabad is a nice city";
        words = s2.split("a");

        for (String word : words) 
        {
            IO.println(word);
        }
    }
}