package com.nit.exception.custom_exception;

class InsufficientBalanceException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public InsufficientBalanceException()
    {
        super("Balance is less than 10000, Please deposit");
    }

    public InsufficientBalanceException(String errorMessage)
    {
        super(errorMessage);
    }
}

public class CustomUncheckedException 
{
    public static void main(String[] args) 
    {
        IO.println("Main method started!!!");

        try
        {
            double balance = Double.parseDouble(
                    IO.readln("Enter your account Balance : "));

            validateBalance(balance);
        }
        catch (InsufficientBalanceException e)
        {
            System.err.println(e.getMessage());
        }

        IO.println("Main method ended!!!");
    }

    public static void validateBalance(double balance)
    {
        if (balance < 10000)
        {
            throw new InsufficientBalanceException();
        }
        else
        {
            IO.println("Your balance is : " + balance);
        }
    }
}
