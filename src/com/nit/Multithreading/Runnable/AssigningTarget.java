package com.nit.Multithreading.Runnable;

class Tatkal implements Runnable 
{
    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();
        IO.println(name + " has booked the ticket under Tatkal Scheme");
    }
}

class PremiumTatkal implements Runnable 
{
    @Override
    public void run() 
    {
        String name = Thread.currentThread().getName();
        IO.println(name + " has booked the ticket under Premium Tatkal Scheme");
    }
}

public class AssigningTarget 
{
    public static void main(String[] args) 
    {

        Thread scott = new Thread(new Tatkal(), "Scott");
        Thread alen = new Thread(new PremiumTatkal(), "Alen");

        scott.start();
        alen.start();
    }
}