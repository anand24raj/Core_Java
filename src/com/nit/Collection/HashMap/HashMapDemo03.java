package com.nit.Collection.HashMap;

// keySet() values() + Loose coupling
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo03
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> newmap1 = new HashMap<>();
        HashMap<Integer, String> newmap2 = new HashMap<>();

        newmap1.put(1, "OCPJP");
        newmap1.put(2, "is");
        newmap1.put(3, "best");

        newmap2.put(4, "Exam");

        newmap1.putAll(newmap2);

        IO.println("All the keys from new map1 :");
        Set<Integer> alltheKeys = newmap1.keySet();
        IO.println(alltheKeys);

        IO.println("All the values from new map1 :");
        Collection<String> values = newmap1.values();
        IO.println(values);

        IO.println("HashMap data through loose coupling..");
        
        HashMap<Integer, String> anotherMap = new HashMap<>(newmap1);
        IO.println("Another map data : " + anotherMap);
    }
}