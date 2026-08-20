package com.nit.Multithreading.Runnable;

public class RunnableCase3 
{
    public static void main(String[] args) 
    {
        Runnable r1 = () -> IO.println(Thread.currentThread().getName());
        Thread t1 = new Thread(r1);
        t1.start();
    }
}