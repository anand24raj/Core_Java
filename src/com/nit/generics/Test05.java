package com.nit.generics;

import java.util.*;

class Car {}

public class Test05 
{
    public static void main(String[] args) 
    {
        ArrayList<Car> a = new ArrayList<>();

        a.add(new Car());
        a.add(new Car());
        a.add(new Car());

        ArrayList<Car> b = a; // assigning Generic to raw type

        IO.println(b);
    }
}