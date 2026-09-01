package com.core_java.blc;

public class Customer {

    private double balance = 10000; // Data hiding

    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("Sorry!! Amount cannot be deposited");
            System.exit(0);
        }
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.err.println("Sorry, Insufficient Balance");
            System.exit(0);
        }
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}
