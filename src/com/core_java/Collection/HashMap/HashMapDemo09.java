package com.core_java.Collection.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo09
{
    public static void main(String[] args)
    {
        Map<String, Integer> flights = new HashMap<>();

        flights.put("Mumbai", 5500);
        flights.put("Bangalore", 7000);
        flights.put("Chennai", 6500);
        flights.put("Vizag", 5000);

        Entry<String, Integer> min = Collections.min(flights.entrySet(),
                        (f1, f2) -> f1.getValue().compareTo(f2.getValue()));

        IO.println(min);

        IO.println("-------------");

        Map<String, Integer> allFlights = new HashMap<>();

        allFlights.put("Mumbai", 5500);
        allFlights.put("Bangalore", 7000);
        allFlights.put("Chennai", 6500);
        allFlights.put("Vizag", 5000);
        allFlights.put("Kolkata", 7000);

        int max = Collections.max(allFlights.values());

        for (HashMap.Entry<String, Integer> expFlight : allFlights.entrySet())
        {
            if (expFlight.getValue() == max)
            {
                IO.println(expFlight.getKey() + " : " + expFlight.getValue());
            }
        }
    }
}