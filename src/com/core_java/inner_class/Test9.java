package com.core_java.inner_class;

class OuterClass {
    private int x = 200;

    class Inner {
        public void display() {
            IO.println("Inner class display method");
        }

        public void getValue() {
            display();
            IO.println("Can access outer private var: " + x);
        }
    }

    public void display() {
        IO.println("Outer class display method");
    }
}

public class Test9 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.Inner in = outer.new Inner();

        in.getValue();
        outer.display();
    }
}

