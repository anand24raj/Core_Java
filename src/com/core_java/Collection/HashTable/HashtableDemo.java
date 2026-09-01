package com.core_java.Collection.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
	Hashtable<Integer, String> map = new Hashtable<>();

	map.put(1, "Java");
	map.put(2, "is");
	map.put(3, "best");
	map.put(4, "language");

	// map.put(5, null); // NPE

	IO.println(map);

	IO.println("-------------");

	for (Map.Entry<Integer, String> m : map.entrySet()) {
	    System.out.println(m.getKey() + " = " + m.getValue());
	}
    }
}