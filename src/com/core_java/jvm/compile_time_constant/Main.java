package com.core_java.jvm.compile_time_constant;

 class Test 
{
    public static final int MAX_VALUE = 999; // compile-time constant
}
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(Test.MAX_VALUE);
    }
}

