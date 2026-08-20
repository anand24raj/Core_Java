package com.nit.String;

import java.util.Arrays;

public class CharToASCII 
{
    public static void main(String[] args) 
    {
        String s1 = "ABCDabcd";
        byte[] bytes = s1.getBytes();

        IO.println(Arrays.toString(bytes));
    }
}