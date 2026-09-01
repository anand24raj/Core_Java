package com.core_java.Collection.MoreEx;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapMethodDemo
{
    public static void main(String[] args)
    {
        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(100, "Amit");
        map.put(101, "Ravi");
        map.put(102, "Vijay");
        map.put(103, "Rahul");

        IO.println("First Key: " + map.firstKey());
        IO.println("Last Key: " + map.lastKey());
        IO.println("headMap: " + map.headMap(102));
        IO.println("tailMap: " + map.tailMap(102));
        IO.println("subMap: " + map.subMap(100, 102));
    }
}