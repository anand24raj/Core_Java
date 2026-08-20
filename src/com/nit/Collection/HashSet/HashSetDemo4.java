package com.nit.Collection.HashSet;

// add, delete, display and exit
import java.util.HashSet;

public class HashSetDemo4
{
    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<>();

        while (true)
        {
            IO.println("Options:");
            IO.println("1. Add element");
            IO.println("2. Delete element");
            IO.println("3. Display HashSet");
            IO.println("4. Exit");

            IO.println("Enter your choice (1/2/3/4): ");
            int choice = Integer.parseInt(IO.readln());

            switch (choice)
            {
                case 1 ->
                {
                    IO.println("Enter the element to add: ");
                    String elementToAdd = IO.readln();

                    if (hashSet.add(elementToAdd))
                    {
                        IO.println("Element added successfully.");
                    }
                    else
                    {
                        IO.println("Element already exists in the HashSet.");
                    }
                }

                case 2 ->
                {
                    IO.println("Enter the element to delete: ");
                    String elementToDelete = IO.readln();

                    if (hashSet.remove(elementToDelete))
                    {
                    		IO.println("Element deleted successfully.");
                    }
                    else
                    {
                        IO.println("Element not found in the HashSet.");
                    }
                }

                case 3 -> 
                {
                    IO.println("Elements in the HashSet:");
                    hashSet.forEach(IO::println);
                }

                case 4 ->
                {
                    IO.println("Exiting the program.");
                    System.exit(0);
                }

                default -> IO.println("Invalid choice. Please try again.");
            }
            IO.println();
        }
    }
}