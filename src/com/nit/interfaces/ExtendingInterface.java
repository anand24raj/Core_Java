package com.nit.interfaces;

interface A {
    void m1();
}

interface B extends A {
    void m2();
}

class Implementer implements B {

    @Override
    public void m1() {
        IO.println("m1 method is overridden");
    }

    @Override
    public void m2() {
        IO.println("m2 method is overridden");
    }
}

public class ExtendingInterface {

    public static void main(String[] args) {
        Implementer i = new Implementer();
        i.m1();
        i.m2();
    }
}

