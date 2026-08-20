package com.nit.Multithreading.Interrupt;

class SharedData 
{
    private volatile boolean flag = false;

    public void startThread() 
    {
        Thread writer = new Thread(() -> 
        {
            try 
            {
                IO.println("Writer thread started");
                Thread.sleep(5000);
                flag = true;
                IO.println("Writer thread made flag true");
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        });

        Thread reader = new Thread(() -> 
        {
            while (!flag) 
            {
                // waiting
            }
            IO.println("Reader thread got the updated value");
        });

        writer.start();
        reader.start();
    }
}

public class VolatileExample 
{
    public static void main(String[] args) 
    {
        new SharedData().startThread();
    }
}