package com.core_java.Collection.ArrayList;

//addAll() used to merge two collection
import java.util.*;

public class ArrayListDemo2 {
    public static void main(String args[]) {

        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Ravi");
        al1.add("Rahul");
        al1.add("Rohit");

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Pallavi");
        al2.add("Sweta");
        al2.add("Puja");

        al1.addAll(al2);

        IO.println("Size of al1 :" + al1.size());
        al1.forEach(str -> IO.println(str.toUpperCase()));

        IO.println("-------------------------------------------");
        ArrayList<String> al3 = new ArrayList<>();
        al3.add("Ravi");
        al3.add("Rahul");
        al3.add("Rohit");

        ArrayList<String> al4 = new ArrayList<>();
        al4.add("Pallavi");
        al4.add("Rahul");
        al4.add("Raj");

        al3.retainAll(al4);

        IO.print("Common Elements : ");
        al3.forEach(x -> IO.println(x));
    }
}