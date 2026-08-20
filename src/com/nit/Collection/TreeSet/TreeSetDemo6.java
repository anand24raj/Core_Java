package com.nit.Collection.TreeSet;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetDemo6
{
    public static void main(String[] args)
    {
        TreeSet<Character> ts1 = new TreeSet<>();

        ts1.add('C');
        ts1.add('B');
        ts1.add('A');

        IO.println(ts1);

        TreeSet<Character> ts2 = new TreeSet<>(ts1);

        IO.println(ts2);
        IO.println("-------------");

        ArrayList<String> listOfCity = new ArrayList<>();

        listOfCity.add("Hyderabad");
        listOfCity.add("Hyderabad");
        listOfCity.add("Pune");
        listOfCity.add("Mumbai");
        listOfCity.add("Ajmer");
        listOfCity.add("Surat");

        TreeSet<String> cities = new TreeSet<>(listOfCity);

        IO.println(cities);
    }
}