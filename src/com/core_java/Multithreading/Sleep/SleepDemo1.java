package com.core_java.Multithreading.Sleep;

class Test extends Thread 
{
    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();

        for (int i = 1; i <= 10; i++) 
        {
            IO.println(i + " by " + name + " thread");

            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                IO.println("Thread is interrupted " + e);
            }
        }
    }
}

public class SleepDemo1 
{
    public static void main(String[] args) 
    {
        Test t1 = new Test();
        t1.setName("Child 1");
        t1.start();
    }
}