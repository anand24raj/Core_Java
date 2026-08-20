package com.nit.generics;

import java.util.*;

public class Test04 
{
    public static void main(String[] args) 
    {
        Dog d1 = new Dog();
        Dog d2 = d1.getDogList().get(0);

        IO.println(d2);
    }
}

class Dog 
{
    public List<Dog> getDogList() 
    {
        ArrayList<Dog> d = new ArrayList<>();

        d.add(new Dog());
        d.add(new Dog());
        d.add(new Dog());

        return d;
    }
}