package com.nit.Collection.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo2
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(10);
        linkedHashSet.add(5);
        linkedHashSet.add(15);
        linkedHashSet.add(20);
        linkedHashSet.add(5); // duplicate

        IO.println("LinkedHashSet elements: " + linkedHashSet);
        IO.println("LinkedHashSet size: " + linkedHashSet.size());

        int elementToCheck = 15;

        if (linkedHashSet.contains(elementToCheck))
        {
            IO.println(elementToCheck + " is present in the LinkedHashSet.");
        }
        else
        {
            IO.println(elementToCheck + " is not present in the LinkedHashSet.");
        }

        int elementToRemove = 10;

        linkedHashSet.remove(elementToRemove);

        IO.println("After removing " + elementToRemove +
                ", LinkedHashSet elements: " + linkedHashSet);

        linkedHashSet.clear();

        IO.println("After clearing, LinkedHashSet elements: " + linkedHashSet);
    }
}