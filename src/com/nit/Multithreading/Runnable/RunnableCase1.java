package com.nit.Multithreading.Runnable;

public class RunnableCase1 
{
    public static void main(String[] args) 
    {
        Runnable r1 = new Runnable() 
        {
            @Override
            public void run() 
            {
                String name = Thread.currentThread().getName();
                IO.println("Running Thread Name is: " + name);
            }
        };

        Thread t1 = new Thread(r1, "Child 1");
        t1.start();
    }
}