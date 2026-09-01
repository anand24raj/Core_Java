package com.core_java.Multithreading.ITC;

class Customer 
{
    private double balance = 10000;

    public synchronized void withdraw(double amount) 
    {
        IO.println("Going to withdraw");

        if (amount > balance) 
        {
            System.err.println("Low Balance, Waiting for deposit");

            try 
            {
                wait(); // wait for deposit
                IO.println("Got notification");
                
            } catch (InterruptedException e) 
            {
            		Thread.currentThread().interrupt();
                 e.printStackTrace();
            }
        }

        this.balance = this.balance - amount;
        IO.println("Balance after withdraw: " + this.balance);
    }

    public synchronized void deposit(double amount) 
    {
        IO.println("Dad is depositing money");
        this.balance += amount;
        IO.println("Balance after deposit: " + this.balance);
        notify(); // notify waiting thread
    }
}

public class ITCDemo4
{
    public static void main(String[] args) 
    {
        Customer customer = new Customer();

        Thread son = new Thread() 
        {
            @Override
            public void run() 
            {
                customer.withdraw(15000);
            }
        };

        Thread dad = new Thread() 
        {
            @Override
            public void run() 
            {
                customer.deposit(10000);
            }
        };

        son.start();
        dad.start();
    }
}