package com.nit.inner_class;

class Outer2 {
    public static int x = 100;

    static {
        IO.println("Static Block of Outer class");
    }

    static class Inner {
        static {
            IO.println("Static Block of Inner class");
        }
    }

    public static void m1() {
        IO.println("m1 static method");
        // IO.println(Outer.x); // If removed, Outer class may not load
    }
}

public class ClassLoadingDemo {
    public static void main(String[] args) {
        Outer2.m1();
        new Outer2.Inner();
    }
}

