package com.nit.Collection.priority_queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo3
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(15);
        maxHeap.add(5);
        maxHeap.add(25);

        while (!maxHeap.isEmpty())
        {
            IO.println(maxHeap.poll());
        }
    }
}