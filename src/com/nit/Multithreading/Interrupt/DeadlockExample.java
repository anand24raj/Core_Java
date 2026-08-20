package com.nit.Multithreading.Interrupt;

public class DeadlockExample 
{
    public static void main(String[] args) 
    {
        String resource1 = "Ameerpet";   // (R1)
        String resource2 = "SR Nagar";   // (R2)

        Thread t1 = new Thread() 
        {
            @Override
            public void run() 
            {
                synchronized (resource1) 
                {
                    IO.println("Thread 1: locked resource 1");

                    try 
                    {
                        Thread.sleep(1000);
                    } 
                    catch (Exception e) 
                    {}

                    synchronized (resource2) 
                    {
                        IO.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        Thread t2 = new Thread() 
        {
            @Override
            public void run() 
            {
                synchronized (resource2) 
                {
                    IO.println("Thread 2: locked resource 2");

                    try 
                    {
                        Thread.sleep(1000);
                    } 
                    catch (Exception e) 
                    {}

                    synchronized (resource1) 
                    {
                        IO.println("Thread 2: locked resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();

    }
}