package com.core_java.Multithreading.ITC;

class Demo extends Thread 
{
    private int val = 0;

    @Override
    public void run() 
    {
        synchronized (this) 
        {
            IO.println("Child thread got the lock");

            for (int i = 1; i <= 10; i++) 
            {
                val = val + 1;
            }

            IO.println("Child Thread completed & sending notification");

            notify(); // notify waiting thread
        }
    }

    public int getVal() 
    {
        return this.val;
    }
}

public class ITCDemo3 
{
    public static void main(String[] args) throws InterruptedException 
    {

        IO.println("Main thread started");

        Demo d1 = new Demo();
        d1.start();

        synchronized (d1) 
        {
            IO.println("Main thread is waiting...");
            d1.wait(); // wait for notification

            IO.println("Main thread got notification");
            IO.println("Value = " + d1.getVal());
        }
    }
}