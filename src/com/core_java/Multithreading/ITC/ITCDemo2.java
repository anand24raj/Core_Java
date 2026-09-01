package com.core_java.Multithreading.ITC;

class Test implements Runnable 
{
    private int value = 0;

    @Override
    public void run() 
    {
        for (int i = 1; i <= 10; i++) 
        {
            value = value + i;

            try 
            {
                Thread.sleep(100);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }

    public int getValue() 
    {
        return this.value;
    }
}

public class ITCDemo2 
{
    public static void main(String[] args) throws InterruptedException 
    {

        IO.println("Main Thread is started!!!");

        Test t1 = new Test();
        
        Thread thread = new Thread(t1);
        thread.start();

        Thread.sleep(100); //  not reliable

        IO.println(t1.getValue()); // unpredictable output
    }
}