package com.core_java.jvm.staticblock;

class Demo 
{
    final static int a;

    static 
    {
        m1();
        a = 100;
        System.out.println("User Value : " + a);
    }

    public static void m1() 
    {
        System.out.println("Default Value : " + a);
    }
}

public class StaticBlockDemo3 
{
    public static void main(String[] args) 
    {
        new Demo();
    }
}
