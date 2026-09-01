package com.core_java.jvm.staticblock;

class Foo1 
{
    static int x;

    static 
    {
        System.out.println("Static Block: x = " + x);
    }
}

public class StaticBlockDemo2 
{
    public static void main(String[] args) 
    {
        new Foo1();
    }
}
//Static block runs before object creation

//Static variables get default values in prepare phase