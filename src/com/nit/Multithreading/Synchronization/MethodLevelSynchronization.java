package com.nit.Multithreading.Synchronization;

class Table 
{

    public synchronized void printTable(int num) 
    {
        for (int i = 1; i <= 10; i++) 
        {
            IO.println(num + " X " + i + " = " + (num * i));

            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }

        IO.println("---------------------");
    }
}

public class MethodLevelSynchronization 
{
    public static void main(String[] args) 
    {
        Table table = new Table(); // lock created

        Thread t1 = new Thread() 
        {
            @Override
            public void run() 
            {
                table.printTable(5);
            }
        };

        Thread t2 = new Thread() 
        {
            @Override
            public void run() 
            {
                table.printTable(10);
            }
        };

        t1.start();
        t2.start();
    }
}