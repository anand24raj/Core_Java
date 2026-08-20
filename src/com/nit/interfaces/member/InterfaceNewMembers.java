package com.nit.interfaces.member;

interface Members {

    // JDK 1.0
    int A = 500;              // public static final
    void m1();                // public abstract

    // JDK 1.8
    default void m2() {
        m4();
        m5();
    }

    static void m3() {
        m5();
    }

    // JDK 9
    private void m4() {
        IO.println("m4 private non-static method");
    }

    private static void m5() {
        IO.println("m5 private static method");
    }

    default void anotherMethod() {
        m4();
        m5();
    }
}

class MyClass implements Members {

    @Override
    public void m1() {
        IO.println("m1 method is overridden");
    }
}

public class InterfaceNewMembers {
    public static void main(String[] args) {

        Members m = new MyClass();
        m.m1();
        m.m2();
        Members.m3();
    }
}
