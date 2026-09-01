package com.core_java.String;

public class WordToChar 
{
    public static void main(String[] args) 
    {
        String str = "Apple fruit";
        char[] chars = str.toCharArray();

        for (char ch : chars) 
        {
            IO.println(ch);
        }
    }
}