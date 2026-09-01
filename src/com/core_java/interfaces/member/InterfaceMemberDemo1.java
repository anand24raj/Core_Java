package com.core_java.interfaces.member;

interface Drawable {
    void draw();
}

public class InterfaceMemberDemo1 {
    public static void main(String[] args) {

        Drawable d = null;

        d.equals(null);     // Object class method
        d.hashCode();       // Object class method
        d.toString();       // Object class method
    }
}
