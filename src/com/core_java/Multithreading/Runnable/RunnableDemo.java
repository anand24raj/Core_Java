package com.core_java.Multithreading.Runnable;

class Test implements Runnable 
{
    @Override
    public void run() 
    {
        IO.println("Child Thread");
    }
}

public class RunnableDemo 
{
    public static void main(String... x) 
    {
        IO.println("Main thread started");
        Thread thread = new Thread(new Test());
        thread.start();
        IO.println("Main thread ended");
    }
}