package com.core_java.Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo5 
{
    public static void main(String[] args) 
    {
        LinkedList<String> train = new LinkedList<>();

        train.add("Coach A");
        train.add("Coach B");
        train.add("Coach C");

        IO.println("Initial Train: " + train);

        train.addFirst("Engine");
        IO.println("After adding Engine at front: " + train);

        train.addLast("Guard Coach");
        IO.println("After adding Guard Coach at end: " + train);

        train.add(2, "Pantry Coach");
        IO.println("After adding Pantry Coach in middle: " + train);

        IO.println("Reached To destination");

        train.removeFirst();
        IO.println("After removing first coach: " + train);

        train.removeLast();
        IO.println("After removing last coach: " + train);

        train.remove(1);
        IO.println("After removing Pantry Coach from middle: " + train);
    }
}