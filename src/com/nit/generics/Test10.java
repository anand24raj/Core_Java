package com.nit.generics;

import java.util.*;

public class Test10 
{
    public static void main(String[] args) 
    {

        Object[] obj = new String[3]; // valid with Array
        obj[0] = "Java";
        obj[1] = "Python";
        obj[2] = 90; // ArrayStoreException

        IO.println(Arrays.toString(obj));
    }
}