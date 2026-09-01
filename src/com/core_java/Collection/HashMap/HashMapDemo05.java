package com.core_java.Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo05
{
    public static void main(String[] args)
    {
        // Create a HashMap to store book titles and availability
        HashMap<String, Boolean> library = new HashMap<>();

        library.put("Core Java", true);
        library.put("Advanced Java", true);
        library.put("HTML", false);
        library.put("JavaScript", true);

        IO.println("Initial Library Status :");

        for (Map.Entry<String, Boolean> status : library.entrySet())
        {
            IO.println(status.getKey() + " : " + status.getValue());
        }

        // Borrow a book
        String bookToBorrow = "Advanced Java";

        if (library.containsKey(bookToBorrow) && library.get(bookToBorrow))
        {
            library.put(bookToBorrow, false);
            IO.println(bookToBorrow + " has been borrowed successfully...");
        }
        else
        {
            IO.println(bookToBorrow + " is not available for borrow");
        }

        // Return a book
        String bookToReturn = "HTML";

        if (library.containsKey(bookToReturn) && !library.get(bookToReturn))
        {
            library.put(bookToReturn, true);
            IO.println(bookToReturn + " has been returned");
        }
        else
        {
            IO.println(bookToReturn + " is not in the library");
        }

        // Display using forEach
        library.forEach((k, v) -> IO.println(k + " : " + v));

        // Check availability
        String bookToCheck = "JavaScript";

        if (library.containsKey(bookToCheck))
        {
            String availability = library.get(bookToCheck) ? "available" : "borrowed";
            IO.println(bookToCheck + " Book is " + availability);
        }
        else
        {
            IO.println(bookToCheck + " is not in the library");
        }

        // Final display
        IO.println("Final Library Status:");

        for (HashMap.Entry<String, Boolean> entry : library.entrySet())
        {
            String status = entry.getValue() ? "Available" : "Borrowed";

            IO.println("Book: " + entry.getKey() + " Status: " + status);
        }
    }
}