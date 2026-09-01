package com.core_java.Multithreading.Daemon;

public class DaemonThread2 
{
    public static void main(String[] args) 
    {

        Thread t = Thread.currentThread();

        IO.println(t.isDaemon()); // false

        t.setDaemon(true); // java.lang.IllegalThreadStateException

        IO.println(t.isDaemon());
    }
}