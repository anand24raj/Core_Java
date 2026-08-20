package com.nit.inner_class;

class MyOuter1 {
    private int x = 15;

    class MyInner {
        public void seeOuter() {
            IO.println("Outer x is " + x);
        }
    }
}

public class Test3 {
    public static void main(String[] args) {
        MyOuter.MyInner m = new MyOuter().new MyInner();
        m.seeOuter();
    }
}

