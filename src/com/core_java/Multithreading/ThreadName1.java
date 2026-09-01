package com.core_java.Multithreading;

class Dostuff extends Thread 
{
    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();
        IO.println("Running Thread name is: " + name);
    }
}

public class ThreadName1 
{
    public static void main(String[] args) {

        Dostuff df1 = new Dostuff();
        Dostuff df2 = new Dostuff();

        df1.start();
        df2.start();

        IO.println("Current thread name is: " + Thread.currentThread().getName());
    }
}