package com.core_java.Multithreading.Priority;

public class PriorityDemo1 
{
    public static void main(String[] args) 
    {
        Thread thread = Thread.currentThread();
        IO.println("Current Thread priority is: " + thread.getPriority()); // default = 5

        thread.setPriority(Thread.MIN_PRIORITY); // 1
        IO.println("Current Thread priority is: " + thread.getPriority());

        thread.setPriority(Thread.MAX_PRIORITY); // 10
        IO.println("Current Thread priority is: " + thread.getPriority());

        // thread.setPriority(0); //  java.lang.IllegalArgumentException
    }
}