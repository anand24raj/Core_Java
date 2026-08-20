package com.nit.method_hiding;

class SuperClass 
{
    public static void accept() 
    {
        IO.println("Static method of super class");
    }
}

class SubClass extends SuperClass 
{
    // Uncomment below method to see Method Hiding
    
    public static void accept() {
        System.out.println("Static method of sub class");
    }
    
}

public class MethodHidingDemo1 
{
    public static void main(String[] args) 
    {
        // Calling static method using class name (Recommended)
        SubClass.accept();

        // Calling static method using object (Not Recommended)
//        SubClass sub = new SubClass();
//        sub.accept();
    }
}
