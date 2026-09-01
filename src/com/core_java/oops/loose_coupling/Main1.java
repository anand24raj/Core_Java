package com.core_java.oops.loose_coupling;

// Interface
interface Vehicle {
    void run();
}

// Outer class
class OuterClass {

    // 1️⃣ Non-static Inner Class
    private class InnerClass {
        void show() {
            IO.println("Non-static Inner Class");
        }
    }

    // 2️⃣ Static Nested Class
    static class NestedClass {
        void display() {
            IO.println("Static Nested Class");
        }
    }

    // Method demonstrating inner classes
    public void m1() {

        // Non-static inner class object
        InnerClass ic = new InnerClass();
        ic.show();

        // 3️⃣ Local Inner Class
        class LocalInner {
            void msg() {
                IO.println("Local Inner Class");
            }
        }

        LocalInner li = new LocalInner();
        li.msg();
    }

    // 4️⃣ Anonymous Inner Class
    public void m2() {
        Vehicle v = new Vehicle() {
            @Override
            public void run() {
                IO.println("Anonymous Inner Class implementing Vehicle");
            }
        };

        v.run();
    }
}

// Main class
public class Main1 {
    public static void main(String[] args) {

        OuterClass obj = new OuterClass();

        obj.m1();
        obj.m2();

        // Static nested class object
        OuterClass.NestedClass nc = new OuterClass.NestedClass();
        nc.display();
    }
}
