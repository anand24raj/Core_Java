package com.nit.method_hiding;

class Alpha
{
    public static void m1() //SM
    {
    }
}

class Beta extends Alpha  
{
//   public void m1()  //NSM
//    {
//    }
}

public class MethodHidingDemo2
{
    public static void main(String[] args)
    {
        IO.println("Hello World!");
    }
}
