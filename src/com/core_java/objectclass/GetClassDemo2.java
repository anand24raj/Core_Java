package com.core_java.objectclass;


class Foo 
{
}

public class GetClassDemo2 
{
    public static void main(String[] args) 
    {

        Foo f1 = new Foo();
        String name = f1.getClass().getName();
        IO.println(name);

        String s1 = "Java";
        IO.println(s1.getClass().getName());
    }
}