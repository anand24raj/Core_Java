package com.nit.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo9 {
    public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();

	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	list.add(9);
	list.add(10);

	// public List subList(int fromIndex, int toIndex)
	List<Integer> subList = list.subList(2, 5); // 3,4,5
	IO.println(subList);

	IO.println("......................................");

	// public boolean contains(Object obj)
	boolean contains = list.contains(1);
	IO.println(contains);

	IO.println("......................................");

	// public int indexOf(Object obj)
	IO.println(list.indexOf(2));

	IO.println("......................................");

	// public void removeIf(Predicate<T> p)
	// remove all even elements
	list.removeIf(num -> num % 2 == 0);
	list.forEach(IO::println);
    }
}