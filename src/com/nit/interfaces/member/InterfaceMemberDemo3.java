package com.nit.interfaces.member;

interface Printable {
    void print();
}

class MyPrint implements Printable {
    @Override
    public void print() {
        IO.println("Printing Something");
    }
}

public class InterfaceMemberDemo3 {
    public static void main(String[] args) {

        Printable p = new MyPrint();

        IO.println(p.hashCode()); // from Object class
    }
}
