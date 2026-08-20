package com.nit.inner_class;

class MyOuter {
    private int x = 7;

    public void makeInner() {   // Outer class NSM
        MyInner in = new MyInner();
        IO.println("Inner y is " + in.y);  // 15
        in.seeOuter();
    }

    class MyInner {
        private int y = 15;

        public void seeOuter() {
            IO.println("Outer x is " + x); // 7
        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        MyOuter m = new MyOuter();
        m.makeInner();
    }
}

