package com.nit.Multithreading.Limitation;

class Customer {

    private double balance = 20000;

    public void withdrawAmount(double amount) 
    {

        String name = Thread.currentThread().getName();

        if (balance >= amount) 
        {
            IO.println(amount + " amount is withdrawn by " + name);

            balance = balance - amount;

            IO.println("Remaining Balance: " + this.balance);
        } 
        else 
        {
            System.err.println("Sorry " + name + " Insufficient Balance");
        }
    }
}

public class BankAccount 
{
    public static void main(String[] args) 
    {
        Customer customer = new Customer();

        Runnable r1 = () -> customer.withdrawAmount(20000);

        Thread t1 = new Thread(r1, "Scott");
        Thread t2 = new Thread(r1, "Alen");

        t1.start();
        t2.start();
    }
}