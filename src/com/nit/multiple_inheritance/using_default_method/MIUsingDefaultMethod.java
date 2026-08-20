package com.nit.multiple_inheritance.using_default_method;

// Interface Alpha with default method
interface Alpha {
    default void m1() {
        IO.println("m1 default method of Alpha interface");
    }
}

// Interface Beta with default method
interface Beta {
    default void m1() {
        IO.println("m1 default method of Beta interface");
    }
}

// Class implementing multiple interfaces with default method conflict
class Implementer implements Alpha, Beta {

    @Override
    public void m1() {
        // Resolve conflict by explicitly calling both interface default methods
        Beta.super.m1();
        Alpha.super.m1();

        IO.println("MI (Multiple Inheritance) is possible by using default methods");
    }
}

// Main class
public class MIUsingDefaultMethod {

    public static void main(String[] args) {
        Implementer i = new Implementer();
        i.m1();
    }
}

