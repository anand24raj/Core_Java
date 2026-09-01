package com.core_java.inner_class;

class BigOuter {

    static class Nest {   // static nested class
        void go() {       // instance method
            IO.println("Hello welcome to static nested class");
        }
    }
}

public class Test11 {
    public static void main(String[] args) {
        BigOuter.Nest n = new BigOuter.Nest();
        n.go();
    }
}
