package com.core_java.Multithreading.Interrupt;

public class InterruptDemo3 
{
    public static void main(String[] args) 
    {
        Thread thread = new Thread(new MyRunnable());
        thread.start();

        try 
        {
            Thread.sleep(7000); // Main thread waits
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        IO.println("Main thread is interrupting Child Thread");
        thread.interrupt();
    }
}

class MyRunnable implements Runnable 
{
    @Override
    public void run() 
    {

        try 
        {
            while (!Thread.currentThread().isInterrupted()) 
            {
                IO.println("Thread is running by locking the resource");
                Thread.sleep(500);
            }
        } 
        catch (InterruptedException e) 
        {
            IO.println("Thread interrupted gracefully.");
        } 
        finally 
        {
            IO.println("Thread resource can be released here.");
        }
    }
}