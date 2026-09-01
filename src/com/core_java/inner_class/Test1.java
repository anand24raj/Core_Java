package com.core_java.inner_class;

class Outer {
    private int a = 15;

    class Inner {   // Non-static inner class
        public void displayValue() {
            IO.println("Value of a is " + a);
        }
    }
}

public class Test1 {
    public static void main(String... args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.displayValue();
    }
}

