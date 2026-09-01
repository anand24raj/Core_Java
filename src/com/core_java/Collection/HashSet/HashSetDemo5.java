package com.core_java.Collection.HashSet;

import java.util.HashSet;

public class HashSetDemo5
{
    public static void main(String[] args)
    {
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Java");
        hs1.add(new String("Java"));

        IO.println("hs1 size is :" + hs1.size()); // 1

        HashSet<String> hs2 = new HashSet<>();
        hs2.add(new String("Java"));
        hs2.add(new String("Java"));

        IO.println("hs2 size is :" + hs2.size()); // 1

        HashSet<StringBuffer> hs3 = new HashSet<>();
        hs3.add(new StringBuffer("Java"));
        hs3.add(new StringBuffer("Java"));

        IO.println("hs3 size is :" + hs3.size()); // 2
    }
}