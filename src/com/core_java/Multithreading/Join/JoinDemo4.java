package com.core_java.Multithreading.Join;

class OTPVerification extends Thread 
{
    @Override
    public void run() 
    {
        IO.println("OTP Verification is in progress...");

        try 
        {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        IO.println("OTP Verified successfully!!!!");
    }
}

class BalanceCheck extends Thread 
{
    @Override
    public void run() 
    {
        IO.println("Balance Verification is in progress....");
        try 
        {
            Thread.sleep(1500);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        IO.println("You have sufficient balance!!!!");
    }
}

public class JoinDemo4 
{
    public static void main(String[] args) throws InterruptedException 
    {
        OTPVerification otp = new OTPVerification();
        BalanceCheck balVerification = new BalanceCheck();

        IO.println("Initiate the transaction");

        otp.start();
        balVerification.start();

        balVerification.join();
        otp.join();

        IO.println("Transaction Successful");
    }
}