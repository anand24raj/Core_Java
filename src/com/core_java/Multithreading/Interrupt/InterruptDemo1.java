package com.core_java.Multithreading.Interrupt;

class Test implements Runnable 
{
    @Override
    public void run() 
    {
        boolean isInterrupted = Thread.currentThread().isInterrupted();
        IO.println("Is Thread Interrupted: " + isInterrupted);

        for (int i = 1; i <= 10; i++) 
        {
            IO.println("i value is :" + i);
            try 
            {
                Thread.sleep(1000); // isInterrupted = false;
            } 
            catch (InterruptedException e) 
            {
                System.err.println("Child Thread Interrupted " + e);
                Thread.currentThread().interrupt(); // isInterrupted = true;
            }
        }
    }
}

public class InterruptDemo1 
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(new Test());
        t1.start();

        // main thread is interrupting the child thread
        t1.interrupt(); // isInterrupted = true;
    }
}