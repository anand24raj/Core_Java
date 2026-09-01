package com.core_java.co_variant;

class RBI 
{
    public Object loan() 
    {
        System.out.println("Bank should provide loan");
        return this;
    }
}

class SBI extends RBI 
{
    @Override
    public RBI loan() 
    {
        System.out.println("Providing loan @ 9.2% ROI");
        return this;
    }
}

public class CoVariantDemo1 
{
    public static void main(String[] args) 
    {
        RBI r = new SBI();
        r.loan();
    }
}
