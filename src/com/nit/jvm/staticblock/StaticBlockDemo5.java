package com.nit.jvm.staticblock;

class Demo1
{
    static 
    { 
    	i= 100; // Initiallizing is possible due to prepare phase
    }
    static int i;
}
public class StaticBlockDemo5 
{
    public static void main(String[] args) 
    {
    	System.out.println(Demo1.i);
    }
}