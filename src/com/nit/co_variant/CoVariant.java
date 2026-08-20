package com.nit.co_variant;

class Super
{
    public void m1()
    {
    }
}

class Sub extends Super
{
  /*  @Override
    public int m1()
    {
        return 0;
    }*/
}

public class CoVariant
{
    public static void main(String[] args)
    {
        IO.println("Hello World!");
    }
}
//Note -> Error, return type int is not compatible with void. 