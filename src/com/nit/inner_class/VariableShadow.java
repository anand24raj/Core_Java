package com.nit.inner_class;

class Outer1 {
    private int x = 100;

    class Inner {
        private int x = 200;

        public void access() {
            IO.println("Inner class x value is : " + this.x);        // 200
            IO.println("Outer class x value is : " + Outer1.this.x); // 100
        }
    }
}

public class VariableShadow {
    public static void main(String[] args) {
        // Single line object creation
        Outer1.Inner inner = new Outer1().new Inner();
        inner.access();
    }
}

