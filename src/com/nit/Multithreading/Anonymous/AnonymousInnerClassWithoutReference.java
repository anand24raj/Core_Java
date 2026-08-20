package com.nit.Multithreading.Anonymous;

public class AnonymousInnerClassWithoutReference 
{
    public static void main(String[] args) 
    {

        new Thread() 
        {
            @Override
            public void run() 
            {
                String name = Thread.currentThread().getName();
                IO.println("Current thread name is: " + name);
            }
        }
        .start();
    }
}