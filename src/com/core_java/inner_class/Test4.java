package com.core_java.inner_class;

class MyOuter2 {
    static int x = 7;

    static class MyInner {
        public static void seeOuter() {
            IO.println("Outer x is " + x);
        }
    }
}

public class Test4 {
    public static void main(String[] args) {
        MyOuter2.MyInner.seeOuter();
    }
}

