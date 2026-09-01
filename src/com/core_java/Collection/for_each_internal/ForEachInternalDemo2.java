package com.core_java.Collection.for_each_internal;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachInternalDemo2 
{
    public static void main(String[] args) 
    {
        Vector<String> listOfCity = new Vector<>();

        listOfCity.add("Hyderabad");
        listOfCity.add("Kolkata");
        listOfCity.add("Pune");
        listOfCity.add("Indore");
        listOfCity.add("Mumbai");

        // Lambda Expression
        Consumer<String> consumer = city -> IO.println(city);

        listOfCity.forEach(consumer);
    }
}