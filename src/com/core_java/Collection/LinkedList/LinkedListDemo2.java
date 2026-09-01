package com.core_java.Collection.LinkedList;

// Methods of LinkedList class
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo2 
{
    public static void main(String[] args) 
    {
        // Stores the element based on the index in a non contiguous memory location
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(900);
        numbers.add(1200);
        IO.println(numbers.get(1));

        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Ravi");  // Rahul
        list.add("Rahul");
        list.addLast("Anand");

        IO.println(list.getFirst());
        IO.println(list.getLast());

        list.removeFirst();
        list.removeLast();

        IO.println(list); //[Rahul]

        IO.println("...............");

        List<String> listOfName = Arrays.asList("Ravi", "Rahul", "Ankit", "Rahul");

        LinkedList<String> nameList = new LinkedList<>(listOfName); // loose coupling
        nameList.replaceAll(name -> name.toUpperCase());
        nameList.forEach(IO::println);
    }
}