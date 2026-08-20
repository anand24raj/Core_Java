package com.nit.Multithreading.Static_Synchronization;

public class StaticSynchronization 
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread() 
        {
            @Override
            public void run() {
                Table.printTable(5);
            }
        };

        Thread t2 = new Thread() 
        {
            @Override
            public void run() 
            {
                Table.printTable(10);
            }
        };

        Thread t3 = new Thread() 
        {
            @Override
            public void run() 
            {
                Table.printTable(15);
            }
        };

        Runnable r1 = () -> Table.printTable(20);
        Thread t4 = new Thread(r1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}