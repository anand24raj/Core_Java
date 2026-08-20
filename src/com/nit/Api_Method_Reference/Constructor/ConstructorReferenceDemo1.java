package com.nit.Api_Method_Reference.Constructor;

import java.util.function.Supplier;

class Accept 
{
    public Accept() 
    {
        IO.println("No argument constructor");
    }

    public void greet() 
    {
        IO.println("Hello Batch 53");
    }
}

public class ConstructorReferenceDemo1 
{
    public static void main(String[] args) 
    {
        Supplier<Accept> s1 = Accept::new;
        Accept accept = s1.get();
        accept.greet();
    }
}