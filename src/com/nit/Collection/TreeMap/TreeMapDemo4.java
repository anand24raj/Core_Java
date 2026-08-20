package com.nit.Collection.TreeMap;

import java.util.TreeMap;

record Student(Integer id, String name) {}

public class TreeMapDemo4
{
    public static void main(String[] args)
    {
        TreeMap<Student, String> map =
                new TreeMap<>((s1, s2) -> s1.id().compareTo(s2.id()));

        map.put(new Student(222, "Satish"), "Hyd");
        map.put(new Student(111, "Zuber"), "Bglr");

        map.forEach((k, v) -> IO.println(k + " : " + v));
    }
}