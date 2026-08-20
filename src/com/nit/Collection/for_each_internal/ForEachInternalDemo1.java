package com.nit.Collection.for_each_internal;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachInternalDemo1 
{
    public static void main(String[] args) 
    {
        Vector<String> listOfCity = new Vector<>();

        listOfCity.add("Hyderabad");
        listOfCity.add("Kolkata");
        listOfCity.add("Mumbai");

        // Anonymous Inner Class
        Consumer<String> consumer = new Consumer<String>() 
        {
            @Override
            public void accept(String city) 
            {
                IO.println(city.toUpperCase());
            }
        };

        listOfCity.forEach(consumer);
    }
}