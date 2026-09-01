package com.core_java.generics;

import java.util.*;

class Alpha {}
class Beta extends Alpha {}
class Gamma extends Beta {}

public class Test12 
{
    public static void main(String[] args)
    {
        List<? extends Number> list1 = new ArrayList<Short>();
        list1.add(null);
        List<? super String> list2 = new ArrayList<Object>();
        list2.add(null);
        List<? super Gamma> list3 = new ArrayList<Beta>();
        list3.add(null);
        List<?> list4 = new ArrayList<>();
        list4.add(null);
        IO.println("yes");
    }
}