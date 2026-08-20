package com.nit.multiple_inheritance;

// Interface Alpha
interface Alpha 
{
    void m1();
}

// Interface Beta
interface Beta 
{
    void m1();
}

// Class implementing multiple interfaces
class Implementer implements Alpha, Beta 
{

    @Override
    public void m1() {
        IO.println("Multiple Inheritance is Possible");
    }
}

// Main class
public class MultipleInheritanceDemo {

    public static void main(String[] args) {
        new Implementer().m1();
    }
}

