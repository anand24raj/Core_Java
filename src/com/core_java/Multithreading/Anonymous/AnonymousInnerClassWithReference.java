package com.core_java.Multithreading.Anonymous;

public class AnonymousInnerClassWithReference 
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread() 
        {
            @Override
            public void run() 
            {
                String name = Thread.currentThread().getName();
                IO.println("Current thread name is: " + name);
            }
        };

        t1.start();
    }
}