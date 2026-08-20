package com.nit.interfaces;

interface Drawable {
    void draw();   // public + abstract by default
}

class Draw implements Drawable {

    @Override
    public void draw() {
        IO.println("Drawing something!!!!");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        Drawable d = new Draw();
        d.draw();
    }
}

