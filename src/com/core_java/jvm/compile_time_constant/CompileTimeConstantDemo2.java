package com.core_java.jvm.compile_time_constant;

class Beta 
{
    public static final int A = m1(); // NOT a compile-time constant

    static 
    {
        System.out.println("Static Block");
    }

    public static int m1() 
    {
        return 100;
    }
}

public class CompileTimeConstantDemo2 
{
    public static void main(String[] args) 
    {
        System.out.println(Beta.A);
    }
}

//Here Beta class will be added