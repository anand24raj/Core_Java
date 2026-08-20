package com.adv_java.atm_project;

//ATMCard.java
public interface ATMCard {

 void deposit(double amt) throws NegativeAmountException;

 void withdraw(double amt) throws NegativeAmountException, InsufficientFundsException;

 void currentBalance();
}