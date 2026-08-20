package com.nit.Multithreading.Daemon;

public class DaemonThreadDemo1 
{
    public static void main(String[] args) 
    {
        IO.println("Main Thread Started...");

        Thread daemonThread = new Thread(() -> 
        {
            while (true) 
            {
                try 
                {
                    Thread.sleep(1000);
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
                IO.println("Daemon thread is running");
            }
        });

        daemonThread.setDaemon(true);
        daemonThread.start();

        Thread userThread = new Thread(() -> 
        {
            for (int i = 1; i <= 10; i++) 
            {
                try 
                {
                    Thread.sleep(1000);
                } 
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
                IO.println("User thread is running " + i + " times");
            }
        });

        userThread.start();

        IO.println("Main Thread Ended...");
    }
}