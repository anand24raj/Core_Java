package com.core_java.generics;

import java.util.*;

public class Test06 
{
    public static void main(String[] args) 
    {
        List<Integer> myList = new ArrayList<>();

        myList.add(4);
        myList.add(6);
        myList.add(5);

        UnknownClass u = new UnknownClass();

        int total = u.addValues(myList);

        IO.println("The sum of Integer Object is :" + total);
    }
}

class UnknownClass {
    public int addValues(List<Integer> list) { // generic to raw type

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