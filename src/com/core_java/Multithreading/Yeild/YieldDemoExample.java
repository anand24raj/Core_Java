package com.core_java.Multithreading.Yeild;

class TestYield implements Runnable 
{
    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();

        for (int i = 1; i <= 10; i++) 
        {
            IO.println(i + " by " + name + " thread");

            if (name.equalsIgnoreCase("Child 1")) 
            {
                Thread.yield(); // give chance to other thread
            }
        }
    }
}

public class YieldDemoExample 
{
    public static void main(String[] args) 
    {
        TestYield t1 = new TestYield();

        Thread thread1 = new Thread(t1, "Child 1");
        Thread thread2 = new Thread(t1, "Child 2");

        thread1.start();
        thread2.start();
    }
}