package com.core_java.inner_class;

class Outer3 {
    static int x = 15;

    static class Inner {
        void msg() {
            IO.println("x value is " + x);
        }
    }
}

public class Test12 {
    public static void main(String[] args) {
        Outer3.Inner obj = new Outer3.Inner();
        obj.msg();
    }
}

