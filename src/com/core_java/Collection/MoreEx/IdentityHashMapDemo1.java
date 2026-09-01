package com.core_java.Collection.MoreEx;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo1
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Java", 1);
        map.put(new String("Java"), 2);

        IO.println(map.size() + " : " + map);

        IO.println("-------------");

        IdentityHashMap<String, Integer> imap = new IdentityHashMap<>();

        imap.put("Java", 1);
        imap.put(new String("Java"), 2);

        IO.println(imap.size() + " : " + imap);
    }
}