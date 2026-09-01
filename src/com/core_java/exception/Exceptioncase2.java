package com.core_java.exception;

class Foo extends RuntimeException 
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public Foo(String msg) 
    {
        super(msg);
    }
}

public class Exceptioncase2
{
    public static void main(String[] args) 
    {
        try 
        {
            throw new Foo("My own error");
        }
        catch (Exception e) 
        {
            IO.println("Inside Catch");
            System.err.println(e);
        }
    }
}
