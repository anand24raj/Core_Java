package com.core_java.Multithreading.thread_group;

class RegularBatch implements Runnable 
{
    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();
        IO.println(name + " has taken the admission under Regular Batch");
    }
}

class PlacementBatch implements Runnable 
{
    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();
        IO.println(name + " has taken the admission under Placement Batch");
    }
}

public class ThreadGroupDemo2 
{
    public static void main(String[] args) 
    {

        ThreadGroup regular = new ThreadGroup("Regular Batch");
        ThreadGroup placement = new ThreadGroup("Placement Batch");

        Thread t1 = new Thread(placement, new PlacementBatch(), "Scott");
        Thread t2 = new Thread(regular, new RegularBatch(), "Alen");

        t1.start();
        t2.start();
    }
}