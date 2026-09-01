package com.core_java.anonymous;

class Bird {
    public void fly() {
        IO.println("Generic Bird is flying");
    }
}

public class AnonymousInnerDemo1 {
    public static void main(String[] args) {

        // Anonymous Inner Class - 1
        Bird parrot = new Bird() {
            @Override
            public void fly() {
                IO.println("Parrot Bird is flying");
            }
        };

        // Anonymous Inner Class - 2
        Bird sparrow = new Bird() {
            @Override
            public void fly() {
                IO.println("Sparrow Bird is flying");
            }
        };

        parrot.fly();
        sparrow.fly();
    }
}
