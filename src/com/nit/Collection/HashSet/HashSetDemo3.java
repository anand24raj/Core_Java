package com.nit.Collection.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo3
{
    public static void main(String[] args)
    {
        Boolean[] values = new Boolean[6];
        HashSet<Object> hs = new HashSet<>();

        values[0] = hs.add(12);
        values[1] = hs.add(12);
        values[2] = hs.add("Java");
        values[3] = hs.add(new String("Java"));
        values[4] = hs.add(78);
        values[5] = hs.add(15);

        IO.println(Arrays.toString(values));

        IO.println("HashSet elements :");
        hs.forEach(IO::println);
    }
}