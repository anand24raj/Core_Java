package com.core_java.Collection.TreeMap;

import java.util.TreeMap;

public class Demo
{
    public static void main(String[] args)
    {
        TreeMap<String, String> map = new TreeMap<>();

        map.put("Ravi", "Hyd");
        map.put("Ankit", "Bglr");

        // map.put(null, "Hyd"); // NPE
        // map.put(true, "Hyd"); // ClassCastException

        IO.println(map);
    }
}