package com.nit.jvm.staticblock;

class Demo3
{
    public static void print() 
    {
    	x = 200;
    	System.out.println("x value is : " + x);  
    }
    static int x;
}

public class StaticBlockDemo11 {
    public static void main(String[] args) 
    {
    	Demo3.print();   
    }
}
