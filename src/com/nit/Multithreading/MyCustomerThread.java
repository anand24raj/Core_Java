package com.nit.Multithreading;

class UserThread extends Thread 
{
    @Override
    public void run() 
    {
        IO.println("My user thread is running");
    }
}

public class MyCustomerThread 
{
    public static void main(String[] args) throws InterruptedException 
    {
        IO.println("Main thread started");

        UserThread ut = new UserThread();
        ut.start();

        IO.println("Main thread ended");
    }
}