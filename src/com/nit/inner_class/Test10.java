package com.nit.inner_class;

class OuterClass1 {
    int x = 10;

    final class InnerClass {
        int y = 20;
    }
}

public class Test10 {
    public static void main(String[] args) {
        OuterClass1 outer = new OuterClass1();
        OuterClass1.InnerClass inner = outer.new InnerClass();

        IO.println("Outer x = " + outer.x);
        IO.println("Inner y = " + inner.y);
    }
}

