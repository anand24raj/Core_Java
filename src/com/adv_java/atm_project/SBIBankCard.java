package com.adv_java.atm_project;

public class SBIBankCard implements ATMCard {

    private double balance;

    public SBIBankCard() {
        // no-arg constructor (REQUIRED)
    }

    @Override
    public void deposit(double amount) throws NegativeAmountException {
        if (amount <= 0) throw new NegativeAmountException("Amount must be positive");

        balance += amount;
        IO.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) throws NegativeAmountException, InsufficientFundsException 
    {

        if (amount <= 0) throw new NegativeAmountException("Amount must be positive");

        if (amount > balance) throw new InsufficientFundsException("Insufficient balance");

        balance -= amount;
        IO.println("Withdrawn: " + amount);
    }

    @Override
    public void currentBalance() {
        IO.println("Current Balance: " + balance);
    }
}