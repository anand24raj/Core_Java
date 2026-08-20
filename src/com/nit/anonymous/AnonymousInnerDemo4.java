package com.nit.anonymous;

interface Printer {
    void print();
}

class Print implements Printer {
    @Override
    public void print() {
        IO.println("Printing Something");
    }
}

class MyPrinter {
    public static Printer getPrinter() {
        return new Print();
    }
}

public class AnonymousInnerDemo4 {
    public static void main(String[] args) {
        Printer printer = MyPrinter.getPrinter();
        printer.print();
    }
}
