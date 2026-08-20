package com.nit.Multithreading.Interrupt;

class Interrupt extends Thread 
{
    @Override
    public void run() 
    {
        Thread.currentThread().interrupt(); // self interruption

        for (int i = 1; i <= 5; i++) 
        {
            IO.println(i);
        }

        try 
        {
            Thread.sleep(1000); // InterruptedException
        } 
        catch (InterruptedException e) 
        {
            System.err.println("Thread has Interrupted");
            Thread.currentThread().interrupt(); // flag becomes true again
        }
    }
}

public class InterruptDemo2 
{
    public static void main(String[] args) 
    {
        Interrupt it = new Interrupt();

        IO.println("Thread State is " + it.getState()); // NEW

        it.start();
    }
}