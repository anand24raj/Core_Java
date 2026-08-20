package com.nit.Multithreading;

class Test extends Thread 
{
    @Override
    public void run() 
    {
        IO.println("Child thread is running");
        IO.println("It is running in a separate Stack");
    }
}

public class IsAliveDemo 
{
    public static void main(String[] args) 
    {
        IO.println("Main thread started!!!");

        Test t1 = new Test();
        IO.println("Is new thread started: " + t1.isAlive());
        t1.start();
        IO.println("Is new thread started after calling start(): " + t1.isAlive());
        IO.println("Main thread ended!!!");
        // t1.start();  java.lang.IllegalThreadStateException
    }
}