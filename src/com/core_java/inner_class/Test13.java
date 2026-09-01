package com.core_java.inner_class;

class Outer4 {
    static int x = 25;

    static class Inner {
        static void msg() {
            IO.println("x value is " + x);
        }
    }
}

public class Test13 {
    public static void main(String[] args) {
        Outer4.Inner.msg();
    }
}

