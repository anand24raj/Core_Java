package com.nit.Collection.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Program where a Student can select multiple subjects

public class HashMapDemo10
{
    public static void main(String[] args)
    {
        HashMap<String, List<String>> map = new HashMap<>();

        map.computeIfAbsent("Raj", _ -> new ArrayList<String>()).add("Java");
        map.computeIfAbsent("Raj", _ -> new ArrayList<String>()).add("Adv Java");

        map.computeIfAbsent("Ravi", _ -> new ArrayList<String>()).add("HTML");
        map.computeIfAbsent("Ravi", _ -> new ArrayList<String>()).add("CSS");

        map.computeIfPresent("Raj", (_, value) ->
        {
            value.add("Spring");
            return value;
        });

        map.computeIfPresent("Ravi", (_, v) ->
        {
            v.add("JavaScript");
            return v;
        });

        map.forEach((key, value) -> IO.println(key + " : " + value));
    }
}