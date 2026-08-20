package com.nit.interfaces.member;

interface Callable {

    // ❌ ERROR: Cannot override Object class method as default
 /*   default String toString() {
        return "Java";
    }*/
}

public class ObjectClassMethodAsDefault {
    public static void main(String[] args) {
    }
}
