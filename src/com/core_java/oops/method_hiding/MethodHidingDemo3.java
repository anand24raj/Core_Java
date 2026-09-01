package com.core_java.oops.method_hiding;

class Alpha1
{
    public void m1() //NSM
    {
    }
}

class Beta1 extends Alpha1
{
    /*public static void m1() //SM
    {
    }*/
}

public class MethodHidingDemo3
{
    public static void main(String[] args)
    {
        IO.println("Hello World!");
    }
}