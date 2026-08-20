package com.adv_java.atm_project;

//KotakBankCard.java
public class KotakBankCard implements ATMCard 
{

 private double balance;

 @Override
 public void deposit(double amt)throws NegativeAmountException 
 {

     if (amt <= 0)throw new NegativeAmountException("Donot pass -ve num or zero ");

     balance += amt;
     IO.println(amt + " credited in Kotak Bank");
 }

 @Override
 public void withdraw(double amt)throws NegativeAmountException, InsufficientFundsException 
 {

     if (amt <= 0) throw new NegativeAmountException("Do not pass -ve num or zero");

     if (amt > balance)throw new InsufficientFundsException("Insufficient Funds");

     balance -= amt;
     IO.println(amt + " debited from Kotak Bank");
 }

 @Override
 public void currentBalance() {
     IO.println("Kotak Bank Balance: " + balance);
 }
}
