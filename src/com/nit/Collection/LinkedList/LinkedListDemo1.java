package com.nit.Collection.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo1 
{
    public static void main(String[] args) 
    {
        final int ITERATION = 100000;

        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATION; i++) 
        {
            arrayList.add(0, 1);
        }

        long endTime = System.currentTimeMillis();
        IO.println("Total Time taken by ArrayList class :" + (endTime - startTime) + " ms");

        LinkedList<Integer> linkedList = new LinkedList<>();

        startTime = System.currentTimeMillis();

        for (int i = 0; i < ITERATION; i++) 
        {
            linkedList.add(0, 1);
        }

        endTime = System.currentTimeMillis();

        IO.println("Total Time taken by LinkedList class :" + (endTime - startTime) + " ms");
    }
}