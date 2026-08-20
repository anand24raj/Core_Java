package com.nit.exception.checked_rules;

class Super1 
{
    public void show() 
    {
        System.out.println("Super class method not throwing checked Exception");
    }
}

class Sub1 extends Super1 
{
   // @Override
   // public void show() throws CloneNotSupportedException  // ❌ Compile-time error
    {
        System.out.println("Sub class method should not throw checked Exception");
    }
}

public class MethodOverridingWithChecke
{
    public static void main(String[] args) 
    {
    }
}
