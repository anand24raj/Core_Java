package com.core_java.oops.polymorphism;

public class BankApplication
{
    void main()
    {
        int x = Integer.parseInt(IO.readln());

        switch (x)
        {
            case 1 ->
            {
                String accountHolderName = IO.readln();
                String accountNumber = IO.readln();
                double balance = Double.parseDouble(IO.readln());

                SavingAccount S = new SavingAccount(accountHolderName, accountNumber, balance);
                S.displayAccountDetails();
                S.calculateIntrest();
            }

            case 2 ->
            {
                String accountHolderName = IO.readln();
                String accountNumber = IO.readln();
                double balance = Double.parseDouble(IO.readln());

                CurrentAccount C = new CurrentAccount(accountHolderName, accountNumber, balance);
                C.displayAccountDetails();
                C.calculateIntrest();
                C.checkOverdraftLimit();
            }

            case 3 ->
            {
                String accountHolderName = IO.readln();
                String accountNumber = IO.readln();
                double balance = Double.parseDouble(IO.readln());
                int depositTerm = Integer.parseInt(IO.readln());

                FixedDepositAccount F = new FixedDepositAccount(accountHolderName, accountNumber, balance, depositTerm);
                F.displayAccountDetails();
                F.calculateIntrest();
            }
        }
    }
}

class BankAccount
{
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;
    public static final String ifsc = "SBIHYD151285";

    BankAccount(String accountHolderName, String accountNumber, double balance)
    {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        if(balance <= 0)
        {
            IO.println("Balance cannot be negative.");
            System.exit(0);
        }
        this.balance = balance;
    }

    public void calculateIntrest()
    {
    }

    public void displayAccountDetails()
    {
        IO.println("Account Holder: " + this.accountHolderName);
        IO.println("Account Number: " + this.accountNumber);
        IO.println("Balance RS :" + this.balance);
        IO.println("IFSC CODE :" + ifsc);
    }
}

class SavingAccount extends BankAccount
{
    protected double intrestRate = 4.0;

    SavingAccount(String accountHolderName, String accountNumber, double balance)
    {
        super(accountHolderName,accountNumber,balance);
    }

    public void calculateIntrest()
    {
        IO.println("Savings Account Interest RS :"+((balance*intrestRate)/100));
    }
}

class CurrentAccount extends BankAccount
{
    protected double overdraftLimit = 5000.0;

    CurrentAccount(String accountHolderName, String accountNumber, double balance)
    {
        super(accountHolderName,accountNumber,balance);
    }

    public void calculateIntrest()
    {
        IO.println("Current accounts do not earn interest.");
    }

    public void checkOverdraftLimit()
    {
        IO.println("Overdraft limit RS :" + overdraftLimit);
    }
}

class FixedDepositAccount extends BankAccount
{
    protected double intrestRate = 6.5;
    protected int depositTerm;

    FixedDepositAccount(String accountHolderName, String accountNumber,
                        double balance, int depositTerm)
    {
        super(accountHolderName,accountNumber,balance);

        if(depositTerm <= 0)
        {
            IO.println("Deposit term must be positive.");
            System.exit(0);
        }
        this.depositTerm = depositTerm;
    }

    public void calculateIntrest()
    {
        IO.println("Fixed Deposit Interest for " + depositTerm +
                   " years RS :" + ((balance*intrestRate*depositTerm)/100));
    }
}
