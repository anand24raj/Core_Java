package com.core_java.Collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo01
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Vanilla");
        map.put(2, "Butterscotch");
        map.put(3, "Chocolate");
        map.put(4, "Cotton Candy");

        IO.println("HashMap entries are :");
        IO.println(map);
        
        IO.println("Retrival through forEach(BiConsumer<T,U> cons");

        map.forEach((key, value) -> IO.println("Key: " + key + " Value: " + value));

        IO.println("Map value by using key : ");
        String value = map.get(2);
        IO.println("Key 2 value is : " + value);

        IO.println("Map value by getOrDefault : ");
        value = map.getOrDefault(5, "Not available");
        IO.println("Value is :" + value);

        IO.println("Is key is available ? " + map.containsKey(4));
        IO.println("Is value Vanilla is available ? " + map.containsValue("Vanilla"));

        map.remove(4);

        IO.println("Map After removing key 4 : " + map);
        
        IO.println("Iteration through HashMap ");

        Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
        itr.forEachRemaining(IO::println);
        
        for(HashMap.Entry<Integer, String> entry : map.entrySet())
        {
        		IO.println("Key is : " + entry.getKey());
        		IO.println("Value is : " + entry.getValue());
        }

        IO.println("Size: " + map.size());
        map.clear();
        IO.println("Is empty: " + map.isEmpty());
    }
}