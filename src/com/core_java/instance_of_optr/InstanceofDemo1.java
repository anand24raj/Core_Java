package com.core_java.instance_of_optr;

class Test { }

public class InstanceofDemo1 {

    public static void main(String[] args) {

        String str = "Java";
        if (str instanceof String) {
            IO.println("str is pointing to String Object");
        }

        Integer i = 90;
        if (i instanceof Integer) {
            IO.println("i is pointing to Integer Object");
        }

        Test t1 = new Test();
        if (t1 instanceof Test) {
            IO.println("t1 is pointing to Test Object");
        }
    }
}
