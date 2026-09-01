package com.core_java.Multithreading.Join;

public class JoinDemo3 
{
    public static void main(String[] args) 
    {
        IO.println("Main Thread started");

        Thread t = Thread.currentThread();

        for (int i = 1; i <= 10; i++) 
        {
            IO.println(i + " by " + t.getName() + " thread");

            try 
            {
                Thread.sleep(100);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }

        try 
        {
            t.join(); // Deadlock (thread waiting for itself)
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        IO.println("Main Thread Ended");
    }
}