package com.nit.exception;

public class ExceptionSuper {
    public static void main(String[] args) {

        Exception e1 = new ArithmeticException();
        IO.println(e1); // Fully Qualified name

        Exception e2 = new ArrayIndexOutOfBoundsException();
        IO.println(e2);

        Exception e3 = new InterruptedException();
        IO.println(e3);
    }
}