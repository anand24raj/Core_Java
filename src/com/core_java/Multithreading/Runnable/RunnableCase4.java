package com.core_java.Multithreading.Runnable;

public class RunnableCase4
{
    public static void main(String[] args) 
    {

        Thread t1 = new Thread(() -> IO.println(Thread.currentThread().getName()));
        t1.start();

        new Thread(() -> IO.println(Thread.currentThread().getName()), "C1").start();
    }
}