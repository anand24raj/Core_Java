package com.nit.Collection.priority_queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo5
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int choice;

        do
        {
            IO.println("\n=== PriorityQueue Menu ===");
            IO.println("1. Insert element");
            IO.println("2. Remove head element (poll)");
            IO.println("3. View head element (peek)");
            IO.println("4. Display PriorityQueue");
            IO.println("5. Exit");

            choice = Integer.parseInt(IO.readln("Enter your choice: "));

            switch (choice)
            {
                case 1 ->
                {
                    int val = Integer.parseInt(IO.readln("Enter element to insert: "));
                    pq.add(val);
                    IO.println(val + " inserted.");
                }

                case 2 ->
                {
                    if (pq.isEmpty())
                    {
                        IO.println("PriorityQueue is empty!");
                    }
                    else
                    {
                        IO.println("Removed: " + pq.poll());
                    }
                }

                case 3 ->
                {
                    if (pq.isEmpty())
                    {
                        IO.println("PriorityQueue is empty!");
                    }
                    else
                    {
                        IO.println("Head element: " + pq.peek());
                    }
                }

                case 4 ->
                {
                    IO.println("PriorityQueue: " + pq);
                }

                case 5 ->
                {
                    IO.println("Exiting...");
                }

                default -> IO.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}