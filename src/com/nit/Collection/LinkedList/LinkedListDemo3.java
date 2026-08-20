package com.nit.Collection.LinkedList;

// ListIterator methods (add(), set(), remove())
import java.util.*;

public class LinkedListDemo3 
{
    public static void main(String[] args) 
    {
        LinkedList<String> city = new LinkedList<>();

        city.add("Kolkata");
        city.add("Bangalore");
        city.add("Hyderabad");
        city.add("Pune");

        IO.println(city);

        ListIterator<String> it = city.listIterator();

        while (it.hasNext()) 
        {
            String cityName = it.next();

            if (cityName.equals("Kolkata")) 
            {
                it.remove();
            } 
            else if (cityName.equals("Hyderabad")) 
            {
                it.add("Ameerpet");
            } 
            else if (cityName.equals("Pune")) 
            {
                it.set("Mumbai");
            }
        }
        city.forEach(IO::println);
    }
}
