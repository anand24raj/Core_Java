package com.nit.objectclass.FinalKeyword;

class C {
    protected int a = 10;
    protected int b = 20;

    public final void calculate() 
    {
        int sum = a + b;
        IO.println("Sum is: " + sum);
    }
}

class D extends C {
    // ❌ Cannot override final method
    /*
    @Override
    public void calculate() {
        int mul = a * b;
        System.out.println("Mul is: " + mul);
    }
    */
}

public class FinalMethodEx 
{
    public static void main(String[] args) 
    {
        C a1 = new D();
        a1.calculate();
    }
}
