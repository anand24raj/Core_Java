package com.core_java.Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;
import java.util.stream.Stream;

public class PossibleWaysToRetrieveCollectionObject 
{
    void main() 
    {
        Vector<String> listOfCity = new Vector<>();

        listOfCity.add("Hyderabad");
        listOfCity.add("Kolkata");
        listOfCity.add("Pune");
        listOfCity.add("Indore");
        listOfCity.add("Mumbai");

        // 1) Using toString()
        IO.println("1) By using toString() method : ");
        IO.println(listOfCity.toString());
        IO.println("");

        // 2) Ordinary for loop
        IO.println("2) By using Ordinary for loop : ");
        for (int index = 0; index < listOfCity.size(); index++)
        {
            IO.println(listOfCity.get(index));
        }
        IO.println("");

        // 3) For-each loop
        IO.println("3) By using for-each loop : ");
        for (String city : listOfCity)
        {
            IO.println(city);
        }
        IO.println("");

        // 4) Enumeration
        IO.println("4) By using Enumeration interface : ");
        Enumeration<String> enumeration = listOfCity.elements();
        while (enumeration.hasMoreElements()) 
        {
            IO.println(enumeration.nextElement());
        }
        IO.println("");

        // 5) Iterator
        IO.println("5) By using Iterator interface : ");
        Iterator<String> iterator = listOfCity.iterator();
        while (iterator.hasNext()) 
        {
            IO.println(iterator.next());
        }
        IO.println("");
        
        // 5) Iterator
        IO.println("5) By using Iterator interface 2nd methods : ");
        Iterator<String> itr = listOfCity.iterator();
        itr.forEachRemaining(IO::println);
        
        IO.println("");

        // 6) ListIterator
        IO.println("6) By using ListIterator interface : ");
        ListIterator<String> listIterator = listOfCity.listIterator();

        // Fetch the Data in Forward Direction
        IO.println("Forward Direction:");
        while (listIterator.hasNext()) 
        {
            IO.println(listIterator.next());
        }

     // Fetch the Data in Backward Direction
        IO.println("Backward Direction : ");
        while (listIterator.hasPrevious()) 
        {
            IO.println(listIterator.previous());
        }
        IO.println("");

        // 7) forEach
        IO.println("7) By using forEach method : ");
        listOfCity.forEach(city -> IO.println(city.toUpperCase()));
        IO.println("");

        // 8) Method Reference
        IO.println("8) By using Method Reference : ");
        listOfCity.forEach(IO::println);
        IO.println("");

        // 9) Spliterator
        IO.println("9) By using Spliterator interface : ");
        Spliterator<String> spliterator = listOfCity.spliterator();
        spliterator.forEachRemaining(city -> IO.println(city));
        IO.println("");

        // 10) Stream
        IO.println("10) By using stream() method of Collection Framework : ");
        Stream<String> stream = listOfCity.stream();
        stream.forEach(IO::println);
        IO.println("");

        // 11) Parallel Stream
        IO.println("11) By using parallelStream() method of Collection Framework : ");
        Stream<String> parallelStream = listOfCity.parallelStream();
        parallelStream.forEach(IO::println);
    }
}