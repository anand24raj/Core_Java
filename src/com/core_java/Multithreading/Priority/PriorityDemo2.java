package com.core_java.Multithreading.Priority;

class Test extends Thread 
{
    @Override
    public void run() 
    {
        int priority = Thread.currentThread().getPriority();
        IO.println("Child thread priority is: " + priority);
    }
}

public class PriorityDemo2 
{
    public static void main(String[] args) 
    {
        Thread thread = Thread.currentThread();
        thread.setPriority(3);

        Test t1 = new Test();
        t1.start();

        IO.println("Main thread priority is: " + thread.getPriority());
    }
}