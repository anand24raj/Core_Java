package com.core_java.jvm.staticblock;

class A 
{
    static 
    {
    	System.out.println("A - Static"); 
    }
    { 
    	System.out.println("A - NSB"); 
    }
    A() 
    {
    	System.out.println("A - Constructor"); 
    }
}

class B extends A 
{
    static 
    {
    	System.out.println("B - Static"); 
    }
    {
    	System.out.println("B - NSB"); 
    }
    B() 
    {
    	System.out.println("B - Constructor"); 
    }
}

public class StaticBlockDemo4 
{
    public static void main(String[] args) 
    {
        new B();
    }
}
