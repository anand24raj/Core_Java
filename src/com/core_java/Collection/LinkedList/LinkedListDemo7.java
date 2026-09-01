package com.core_java.Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo7 
{
    public static void main(String args[]) 
    {
        LinkedList<String> list = new LinkedList<>();

        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
        list.add("Item 6");
        list.add("Item 7");
        list.add("Item 9");

        list.add(0, "Item 0");
        list.add(1, "Item 1");
        list.add(8, "Item 8");
        list.add(9, "Item 10");

        IO.println(list);

        list.remove("Item 5");
        IO.println(list);

        list.removeLast();
        IO.println(list);

        list.removeFirst();
        IO.println(list);

        list.set(0, "Ajay"); // set() will replace the existing value 
        list.set(1, "Vijay");
        list.set(2, "Anand");
        list.set(3, "Aman");
        list.set(4, "Suresh");
        list.set(5, "Ganesh");
        list.set(6, "Ramesh");

        list.forEach(x -> IO.println(x));
    }
}