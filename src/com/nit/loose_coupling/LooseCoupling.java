package com.nit.loose_coupling;

class Bird {
    public void fly() {
        IO.println("Generic Bird is flying");
    }
}

class Parrot extends Bird {
    @Override
    public void fly() {
        IO.println("Parrot Bird is flying");
    }
}

class Peacock extends Bird {
    @Override
    public void fly() {
        IO.println("Peacock Bird is flying");
    }
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        IO.println("Sparrow Bird is flying");
    }
}

public class LooseCoupling {

    public static void main(String[] args) {

        Bird b1 = null;

        b1 = new Peacock();
        callingBirdBehavior(b1);

        b1 = new Parrot();
        callingBirdBehavior(b1);

        b1 = new Sparrow();
        callingBirdBehavior(b1);
    }

    // Loose Coupling method
    public static void callingBirdBehavior(Bird bird) {
        bird.fly();
    }
}
