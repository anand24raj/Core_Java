package com.nit.method_hiding;

class Super
{
    public static void m1()
    {
        IO.println("m1 static method of super class");
    }
}

class Sub extends Super
{
   /* public static int m1()
    {
        IO.println("m1 static method of Sub class");
        return 0;
    }*/
}

public class MethodHidingDemo4
{
    public static void main(String[] args)
    {
    }
}
