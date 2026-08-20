package com.nit.Collection.priority_queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo1
{
    public static void main(String[] args)
    {
        PriorityQueue<Object> pq = new PriorityQueue<>();

        pq.add("Orange");
        pq.add("Apple");
        pq.add("Mango");
        pq.add("Guava");
        pq.add("Grapes");

        // pq.add(null); // Invalid (NPE)
        // pq.add(23);   // Invalid (ClassCastException)

        IO.println(pq);
    }
}