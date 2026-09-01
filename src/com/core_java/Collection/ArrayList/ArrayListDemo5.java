package com.core_java.Collection.ArrayList;

import java.util.*;

public class ArrayListDemo5 
{
    public static void main(String[] args) 
    {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Hyderabad");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Chennai");

        // Convert non synchronized ArrayList into synchronized ArrayList
        List<String> synchronizedList = Collections.synchronizedList(cities);
        synchronizedList.forEach(IO::println);

        // Reading forward + backward
        List<String> listOfCourse = Arrays.asList("B.Tech", "M.Tech", "BCA", "MCA");

        ListIterator<String> listItr = listOfCourse.listIterator();

        IO.println("In forward Direction");
        while (listItr.hasNext()) 
        {
            IO.println(listItr.next());
        }

        IO.println("In Backward Direction");
        while (listItr.hasPrevious()) 
        {
            IO.println(listItr.previous());
        }
    }
}