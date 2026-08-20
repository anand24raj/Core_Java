package com.nit.Collection.LinkedList;

// Insertion, deletion, displaying and exit
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo4 
{
    public static void main(String[] args) 
    {
        List<Integer> linkedList = new LinkedList<>();

        while (true) 
        {
            IO.println("Linked List: " + linkedList);
            IO.println("1. Insert Element");
            IO.println("2. Delete Element");
            IO.println("3. Display Element");
            IO.println("4. Exit");

            int choice = Integer.parseInt(IO.readln("Enter your choice: "));

            switch (choice) 
            {
                case 1:
                    int elementToAdd = Integer.parseInt(IO.readln("Enter element: "));
                    linkedList.add(elementToAdd);
                    IO.println(elementToAdd + " added successfully");
                    break;

                case 2:
                    if (linkedList.isEmpty()) 
                    {
                        IO.println("LinkedList is empty, Nothing to delete");
                    } else 
                    {
                        int elementToDelete = Integer.parseInt(IO.readln("Enter element: "));
                        boolean removed = linkedList.remove(Integer.valueOf(elementToDelete));

                        if (removed) 
                        {
                            IO.println(elementToDelete + " deleted successfully");
                        } 
                        else 
                        {
                            IO.println(elementToDelete + " not found");
                        }
                    }
                    break;

                case 3:
                    IO.println("Elements in the linked list:");
                    linkedList.forEach(IO::println);
                    break;

                case 4:
                    IO.println("Exiting program...");
                    System.exit(0);

                default:
                    IO.println("Invalid choice");
            }
        }
    }
}