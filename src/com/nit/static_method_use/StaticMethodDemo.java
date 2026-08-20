package com.nit.static_method_use;

// Interface with static method
interface Callable 
{

    static void call() 
    {
        IO.println("Static method of an interface");
    }
}

// Concrete class implementing the interface
class Call implements Callable 
{
    // Nothing needed here, cannot override static method
}

// Main class
public class StaticMethodDemo 
{

    public static void main(String[] args) 
    {

        // ❌ Invalid ways to call static interface method:
        // Call.call(); // ❌ Error
        // new Call().call(); // ❌ Error

        // ✅ Correct way to call static method in interface
        Callable.call();
    }
}


