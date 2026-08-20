package com.nit.objectclass;

class Sample
{
}

public class GetClassDemo
{
    public static void main(String[] args)
    {
        Sample s = new Sample();

        Class<?> cls = s.getClass();

        System.out.println(cls);      // prints Class object
        System.out.println(cls.getName()); // prints Fully Qualified Name
    }
}