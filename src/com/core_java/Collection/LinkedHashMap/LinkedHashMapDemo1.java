package com.core_java.Collection.LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo1
{
    public static void main(String[] args)
    {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Raj");
        map.putIfAbsent(1, "Ravi"); // won't replace
        map.put(5, "Scott");
        map.put(3, null);
        map.put(4, null);
        map.put(2, "Smith");
        map.put(null, "John");

        map.forEach((k, v) -> IO.println(k + " : " + v));
    }
}