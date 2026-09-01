package com.core_java.generics;

import java.util.*;

class BoundExample 
{
    public static void printNumbers(List<? extends Number> list) 
    {
        for (Number n : list) 
        {
            IO.println(n);
        }
    }

    public static void addNumbers(List<? super Integer> list) 
    {
        list.add(100);
        list.add(200);
        list.add(300);
    }
}

public class Test13 
{
    public static void main(String[] args) 
    {
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(10.5, 20.5, 30.5);

        IO.println("Printing Integers:");
        BoundExample.printNumbers(intList);

        IO.println("Printing Doubles:");
        BoundExample.printNumbers(doubleList);

        IO.println("----------------");

        List<Number> numList = new ArrayList<>();
        BoundExample.addNumbers(numList);
        IO.println("Numbers after adding: " + numList);

        List<Object> objList = new ArrayList<>();
        BoundExample.addNumbers(objList);
        IO.println("Objects after adding: " + objList);
    }
}