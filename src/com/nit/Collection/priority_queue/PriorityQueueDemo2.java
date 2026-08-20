package com.nit.Collection.priority_queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo2
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(11);
        pq.add(2);
        pq.add(4);
        pq.add(6);

        IO.println(pq);
    }
}