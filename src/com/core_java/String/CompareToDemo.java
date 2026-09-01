package com.core_java.String;

public class CompareToDemo 
{
    public static void main(String[] args) 
    {
        String s1 = "A";
        String s2 = "a";

        IO.println(s1.compareToIgnoreCase(s2));
        IO.println(s1.compareTo(s2));

        String s3 = "Raj";
        String s4 = "Ravi";
        IO.println(s3.compareTo(s4));

        String s5 = "ratan";
        String s6 = "sachin";
        IO.println(s6.compareTo(s5));
    }
}