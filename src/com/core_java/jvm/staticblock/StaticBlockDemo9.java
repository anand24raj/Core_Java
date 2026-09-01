package com.core_java.jvm.staticblock;

class Test1
{
    public static final Test1 t1 = new Test1();

    static 
    {
        System.out.println("Static block");
    }

    {
        System.out.println("Non-static block");
    }

    Test1() 
    {
        System.out.println("No Argument Constructor");
    }
}

public class StaticBlockDemo9
{
    public static void main(String[] args) 
    {
        new Test1();
    }
}
//Static fields initialized before static block

//Object creation happens twice
