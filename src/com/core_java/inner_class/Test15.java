package com.core_java.inner_class;

class MyOuter3 {
    private String x = "Outer class private data";

    public void doStuff() {
        String z = "local variable"; // effectively final

        final class MyInner {   // local inner class
            public void seeOuter() {
                IO.println("Outer x is " + x);
                IO.println("Local variable z is " + z);
            }
        }

        MyInner mi = new MyInner();
        mi.seeOuter();
    }
}

public class Test15 {
    public static void main(String[] args) {
        MyOuter3 m = new MyOuter3();
        m.doStuff();
    }
}

