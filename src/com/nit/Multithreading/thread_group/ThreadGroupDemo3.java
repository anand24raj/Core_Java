package com.nit.Multithreading.thread_group;

public class ThreadGroupDemo3 
{
    public static void main(String[] args) 
    {

        Thread thread = Thread.currentThread(); 
        // Thread[#3,main,5,main]

        IO.println(thread.toString());
    }
}