package com.core_java.Multithreading.Limitation.Obj_Level_syn;

public class LimitationOfObjectLevel 
{
    public static void main(String[] args) 
    {
    		Table obj1 = new Table(); // lock1
        Table obj2 = new Table(); // lock2

        Thread t1 = new Thread() 
        {
            @Override
            public void run() 
            {
                obj1.printTable(5); // uses lock1
            }
        };

        Thread t2 = new Thread() 
        {
            @Override
            public void run() 
            {
                obj1.printTable(7); // uses lock1
            }
        };

        Thread t3 = new Thread() 
        {
            @Override
            public void run() 
            {
                obj2.printTable(12); // uses lock2
            }
        };

        Thread t4 = new Thread() 
        {
            @Override
            public void run() 
            {
                obj2.printTable(15); // uses lock2
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}