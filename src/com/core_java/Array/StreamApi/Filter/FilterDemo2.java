package com.core_java.Array.StreamApi.Filter;

import java.util.Arrays;

//Q2) Retrieve cities which starts with 'H' character in string array
public class FilterDemo2 
{
 public static void main(String[] args) 
 {
     String[] cities = {"Ajmer", "Bombay", "Hyderabad", "Haryana", "Hitech city"};

     Object[] array = Arrays.stream(cities)
             .filter(city -> city.startsWith("H")).toArray();

     IO.println(Arrays.toString(array));
 }
}