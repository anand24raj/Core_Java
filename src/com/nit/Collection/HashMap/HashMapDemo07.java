package com.nit.Collection.HashMap;

import java.util.HashMap;

public class HashMapDemo07
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();

        map.computeIfAbsent("A", _ -> 100);
        map.computeIfAbsent("A", _ -> 200);
        map.computeIfAbsent("B", key -> key.length());
        map.computeIfAbsent(null, _ -> 300);
        
        map.computeIfAbsent("C", _ -> null);
        map.put("E", null);
        map.computeIfAbsent("E", _ -> 500);

        IO.println(map);
    }
}