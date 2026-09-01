package com.core_java.inner_class;

class MyOuter4 {
    private String z = "Outer class Data";

    public void doStuff() {
        String x = "local variable";

        class MyInner {
            String z = "CLASS instance variable";

            public void seeOuter() {
                IO.println("Outer z is : " + MyOuter4.this.z);
                IO.println("Inner class z is : " + this.z);
                IO.println("Local variable x is : " + x);
            }
        }

        MyInner mi = new MyInner();
        mi.seeOuter();
    }
}

public class Test16 {
    public static void main(String[] args) {
        MyOuter4 m = new MyOuter4();
        m.doStuff();
    }
}

