package com.nit.inner_class;

class Outer5 {
    int x = 15;   // instance variable

    static class Inner {
        void msg() {
            // IO.println("x value is " + x); ❌ ERROR
            IO.println("Cannot access instance variable from static nested class");
        }
    }
}

public class Test14 {
    public static void main(String[] args) {
        Outer5.Inner obj = new Outer5.Inner();
        obj.msg();
    }
}

