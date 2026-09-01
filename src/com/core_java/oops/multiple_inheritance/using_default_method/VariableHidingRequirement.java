package com.core_java.oops.multiple_inheritance.using_default_method;

// Interface with a constant
interface A {
    int x = 100; // public static final by default
}

// Abstract class with its own field
abstract class B {
    int x = 200;
}

// Concrete class
class C extends B implements A {
    int x = 300;

    public void show() {
        IO.println(x);      // 300 → field of C
        IO.println(super.x); // 200 → field of B
        IO.println(A.x);     // 100 → field of interface A
    }
}

// Main class
public class VariableHidingRequirement {

    public static void main(String[] args) {
        new C().show();
    }
}

// Utility class for printing
class IO {
    public static void println(String msg) {
        System.out.println(msg);
    }

    public static void println(int num) {
        System.out.println(num);
    }
}
