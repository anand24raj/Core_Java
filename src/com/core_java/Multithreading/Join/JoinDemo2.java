package com.core_java.Multithreading.Join;

public class JoinDemo2 
{
    public static void main(String[] args) 
    {
        IO.println("Main thread started!!!");
        Alpha alpha = new Alpha();
        alpha.setName("Alpha_Thread");
        alpha.start();

        try 
        {
            alpha.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        IO.println("Main thread ended!!!");
    }
}

class Alpha extends Thread 
{
    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();
        Beta beta = new Beta();
        beta.setName("Beta_Thread");
        beta.start();

        try 
        {
            beta.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        IO.println("Alpha thread re-started!!!");

        for (int i = 1; i <= 10; i++) 
        {
            IO.println(i + " by " + name);
            try 
            {
                Thread.sleep(100);
            } 
            catch (InterruptedException e) 
            {
            	
            }
        }
    }
}

class Beta extends Thread 
{
    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();
        
        for (int i = 1; i <= 20; i++) 
        {
            IO.println(i + " by " + name);

            try 
            {
                Thread.sleep(100);
            } 
            catch (InterruptedException e) 
            {
            	
            }
        }
    }
}