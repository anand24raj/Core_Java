package com.core_java.Multithreading;

class Foo extends Thread 
{
    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();
        IO.println(name + " is running");
    }
}

public class ExceptionDemo 
{
    public static void main(String[] args) 
    {
        String name = Thread.currentThread().getName();
        IO.println(name + " thread started!!");

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        f1.start();
        f2.start();

        // Exception
        IO.println(10 / 0);

        IO.println(name + " thread ended!!");
    }
}