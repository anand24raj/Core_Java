package com.core_java.co_variant;

class Animal 
{
}

class Dog extends Animal 
{
}

class Alpha 
{
    public Animal show() 
    {
        IO.println("Alpha class show method");
        return null;
    }
}

class Beta extends Alpha 
{
    @Override
    public Dog show() 
    {
        IO.println("Beta class show method");
        return null;
    }
}

public class CoVariantDemo 
{
    public static void main(String[] args) 
    {
        Alpha a = new Beta();
        a.show();
    }
}
