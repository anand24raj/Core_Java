package com.core_java.Collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1
{
    public static void main(String[] args)
    {
        Set<Integer> hs = new HashSet<>();

        hs.add(67);
        hs.add(89);
        hs.add(33);
        hs.add(45);
        hs.add(12);
        hs.add(35);
        hs.add(null);

        hs.forEach(num -> IO.println(num));
    }
}