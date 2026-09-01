package com.core_java.Multithreading.ITC;

// Program on notifyAll()
class Resource 
{
    private boolean flag = false;

    public synchronized void waitMethod() { // Child1 Child2 Child3

        IO.println("Wait");

        while (!flag)  // Infinite loop -> finite loop
        {	
            try 
            {
                IO.println(Thread.currentThread().getName() + " is waiting...");
                IO.println(Thread.currentThread().getName() + " is waiting for notifications.");
                wait();
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }

        IO.println(Thread.currentThread().getName() + " thread completed!!");
    }

    public synchronized void setMethod() 
    {
        IO.println("notifyAll");

        this.flag = true;

        IO.println(Thread.currentThread().getName() + " has made flag value true");

        notifyAll(); // Notify all waiting threads
    }
}

public class ITCDemo6 
{
    public static void main(String[] args) 
    {
        Resource r1 = new Resource(); // lock is created

        Thread t1 = new Thread(() -> r1.waitMethod(), "Child 1");
        Thread t2 = new Thread(() -> r1.waitMethod(), "Child 2");
        Thread t3 = new Thread(() -> r1.waitMethod(), "Child 3");

        t1.start();
        t2.start();
        t3.start();

        try 
        {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        // Another Thread
        Thread setter = new Thread(() -> r1.setMethod(), "Setter_Thread");
        setter.start();
    }
}