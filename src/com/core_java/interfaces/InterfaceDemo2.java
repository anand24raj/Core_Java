package com.core_java.interfaces;

interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    String getName();
}

class Customer implements Bank {

    private String name;
    private double balance;

    public Customer(String name, double balance) {
        super();
        this.name = name;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("Deposit amount cannot be zero or negative");
            System.exit(0);
        }

        this.balance += amount;
        IO.println(amount + " amount deposited successfully in " + this.getName() + " account");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.err.println("Sorry!!! Insufficient balance");
            System.exit(0);
        }

        this.balance -= amount;
        IO.println(amount + " amount withdrawn successfully from " + this.getName() + " account");
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public String getName() {
        return this.name;
    }
}


public class InterfaceDemo2 
{

    public static void main(String[] args) 
    {

        Bank bank = new Customer("Surya Allen", 5000);

        IO.println(bank.getName() + " has " + bank.getBalance() + " amount in the account");

        bank.deposit(9000);

        IO.println(bank.getName() + " has " + bank.getBalance() + " amount in the account");

        bank.withdraw(3000);

        IO.println(bank.getName() + " has " + bank.getBalance() + " amount in the account");
    }
}



