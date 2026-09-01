package com.core_java.Multithreading.Synchronization;

class PrintThread 
{
    public void printThreadName() 
    {
        String name = Thread.currentThread().getName();
        IO.println("Thread Name is: " + name);

        synchronized (this) 
        { // critical section
            for (int i = 1; i <= 10; i++) 
            {
                IO.println(i + " by " + name + " thread");

                try 
                {
                    Thread.sleep(500);
                } 
                catch (InterruptedException e) 
                {
                    System.err.println("Thread is Interrupted");
                }
            }

            IO.println("Synchronized block ended!!");
        }
    }
}

public class BlockLevelSynchronization 
{
    public static void main(String[] args) 
    {

        PrintThread pt = new PrintThread(); // lock created

        Runnable r1 = () -> pt.printThreadName();

        Thread t1 = new Thread(r1, "Child1");
        Thread t2 = new Thread(r1, "Child2");

        t1.start();
        t2.start();
    }
}