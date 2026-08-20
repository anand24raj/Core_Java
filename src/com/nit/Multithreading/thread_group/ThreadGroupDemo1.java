package com.nit.Multithreading.thread_group;

class Test implements Runnable 
{
    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();
        IO.println("Running thread name is : " + name);
    }
}

public class ThreadGroupDemo1 
{
    public static void main(String[] args) 
    {
        ThreadGroup group = new ThreadGroup("Batch 53");

        Thread t1 = new Thread(group, new Test(), "Student1");
        Thread t2 = new Thread(group, new Test(), "Student2");
        Thread t3 = new Thread(group, new Test(), "Student3");
        Thread t4 = new Thread(group, new Test(), "Student4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        IO.println("Group Related information :");
        IO.println("Group Name is : " + group.getName());
        IO.println("Active threads under this group: : " + group.activeCount());
    }
}