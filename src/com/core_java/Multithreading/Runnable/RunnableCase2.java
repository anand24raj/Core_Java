package com.core_java.Multithreading.Runnable;

public class RunnableCase2 
{
    public static void main(String[] args) 
    {
        Thread thread = new Thread(new Runnable() 
        {
            @Override
            public void run() 
            {
                String name = Thread.currentThread().getName();
                IO.println("Running Thread Name is: " + name);
            }
        });

        thread.start();
    }
}