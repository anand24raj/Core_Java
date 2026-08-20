package com.nit.generics;

import java.util.*;

public class Test07 
{
    public static void main(String[] args) 
    {
        List<Integer> myList = new ArrayList<>();

        myList.add(4);
        myList.add(6);

        UnknownClass2 u = new UnknownClass2();

        int total = u.addValues(myList);

        IO.println(total);
    }
}

class UnknownClass2 
{
    public int addValues(List<Integer> list) { // Generic to raw

        list.add(5); // adding object by raw type

        Iterator<Integer> it = list.iterator();
        int total = 0;

        while (it.hasNext()) 
        {
            int i = (Integer) it.next();
            total += i;
        }

        return total;
    }
}