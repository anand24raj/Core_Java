package com.nit.Multithreading;

class Sample extends Thread 
{
    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();

        for (int i = 1; i <= 10; i++) 
        {
            IO.println(name + " thread is running " + i + " times");
        }
    }
}

public class ThreadLoop 
{
    public static void main(String[] args) 
    {

        new Sample().start();

        String name = Thread.currentThread().getName();

        for (int i = 1; i <= 10; i++) 
        {
            IO.println(name + " thread is running " + i + " times");
        }

        int x = 1;
        do 
        {
            IO.println("Java");
            x++;
        } 
        while (x <= 10);
    }
}