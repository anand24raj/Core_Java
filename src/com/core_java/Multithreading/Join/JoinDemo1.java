package com.core_java.Multithreading.Join;

class Join extends Thread 
{
    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();
        IO.println(name + " thread is started");

        for (int i = 1; i <= 5; i++) 
        {
            IO.println(i + " by " + name + " thread");
            
            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        IO.println(name + " thread is ended");
    }
}

public class JoinDemo1 
{
    public static void main(String[] args) throws InterruptedException 
    {
        IO.println("Main thread started");

        Join j1 = new Join();
        Join j2 = new Join();
        Join j3 = new Join();

        j1.setName("J1");
        j2.setName("J2");
        j3.setName("J3");

        j1.start();
        j1.join(); // Main thread waits here j1 to complete
        IO.println("Main thread wake up");

        j2.start();
        j3.start();
        IO.println("Main thread ended");
    }
}