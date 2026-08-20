package com.nit.jvm.compile_time_constant;

class Alpha 
{
    public static final int A = 100; // Compile-time constant

    static 
    {
        System.out.println("Static Block");
    }
}

public class CompileTimeConstantDemo1 
{
    public static void main(String[] args)
    {
        System.out.println(Alpha.A);
    }
}

//Here alpha.class file will not be loaded 