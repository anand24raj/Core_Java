package com.nit.Multithreading.Limitation.Obj_Level_syn;

public class Table 
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
                System.err.println("Thread has Interrupted!!!");
            }
        }

        IO.println("-------------------------");
    }
}
