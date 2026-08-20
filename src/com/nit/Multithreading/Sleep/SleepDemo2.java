package com.nit.Multithreading.Sleep;

class Foo extends Thread 
{
    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();

        for (int i = 1; i <= 5; i++) 
        {
            IO.println(i + " by " + name + " thread");

            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                IO.println("Thread interrupted");
            }
        }
    }
}

public class SleepDemo2 
{
    public static void main(String[] args) 
    {
        Foo f1 = new Foo();
        Foo f2 = new Foo();

        f1.setName("Thread 1");
        f2.setName("Thread 2");

        f1.start();
        f2.start();
    }
}