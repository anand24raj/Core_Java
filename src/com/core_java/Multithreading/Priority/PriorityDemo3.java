package com.core_java.Multithreading.Priority;

class Foo implements Runnable 
{
    @Override
    public void run() 
    {
        for (int i = 1; i <= 100000; i++) 
        {
            // Busy loop to give CPU time
        }

        Thread t = Thread.currentThread();
        IO.println("Name of the thread is: " + t.getName() + " Priority is: " + t.getPriority());
    }
}

public class PriorityDemo3 
{
    public static void main(String[] args) 
    {
        Foo f1 = new Foo();

        Thread t1 = new Thread(f1, "Low_Priority");
        Thread t2 = new Thread(f1, "High_Priority");

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}