package com.core_java.interfaces.member;

@FunctionalInterface
interface Moveable {
    void move();

    // Object class methods (compiler ignores these)
    int hashCode();
    boolean equals(Object obj);
    String toString();
}

public class InterfaceMemberDemo2 {
    public static void main(String[] args) {
        // No implementation required here
    }
}
