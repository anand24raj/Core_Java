package com.nit.functionalinterface;

@FunctionalInterface
interface Drawable {
    void draw(); // SAM (Single Abstract Method)
    
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        Drawable square = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing Square!!!");
            }
        };

        square.draw();
    }
}
