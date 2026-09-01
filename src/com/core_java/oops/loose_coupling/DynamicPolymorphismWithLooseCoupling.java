// Program on downcasting with Loose Coupling
package com.core_java.oops.loose_coupling;

// Parent class
class Payment {
    public void makePayment() 
    {
        IO.println("Generic Payment");
    }
}

// Child class 1
class CreditCard extends Payment 
{
    @Override
    public void makePayment() 
    {
        IO.println("Making a Payment through Credit Card");
    }

    public void offer() 
    {
        IO.println("Get 2 days Holiday in GOA");
    }
}

// Child class 2
class DebitCard extends Payment 
{
    @Override
    public void makePayment() 
    {
        IO.println("Making a Payment through Debit Card");
    }
}

// Child class 3
class UPI extends Payment 
{
    @Override
    public void makePayment() 
    {
        IO.println("Making a Payment through UPI");
    }

    public void offer() 
    {
        IO.println("Get 1000 RS cash back");
    }
}

public class DynamicPolymorphismWithLooseCoupling 
{

    public static void main(String[] args) 
    {

        Payment p = null;

        p = new CreditCard();
        selectAndMakeThePayment(p);

        IO.println("..................");

        p = new DebitCard();
        selectAndMakeThePayment(p);

        IO.println("..................");

        p = new UPI();
        selectAndMakeThePayment(p);
    }

    // Loose coupling + Downcasting
    public static void selectAndMakeThePayment(Payment payment) 
    {

        if (payment instanceof CreditCard card) 
        {     // JDK 16+
            card.makePayment();
            card.offer();

        } 
        else if (payment instanceof DebitCard card) 
        {
            card.makePayment();

        }
        else if (payment instanceof UPI upi) 
        {
            upi.makePayment();
            upi.offer();
        }
    }
}
