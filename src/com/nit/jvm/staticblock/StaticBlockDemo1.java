package com.nit.jvm.staticblock;

class Test
{
    static int x;

    static 
    {
        x = 100;
        System.out.println("x value is : " + x);
    }

    static 
    {
        x = 200;
        System.out.println("x value is : " + x);
    }
    static 
    {
        x = 300;
        System.out.println("x value is : " + x);
    }
}

public class StaticBlockDemo1 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Method");
        System.out.println(Test.x);
    }
}
//Multiple static blocks → execute in order