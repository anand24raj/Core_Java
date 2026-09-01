package com.core_java.exception.checked_rules;

import java.io.EOFException;

class Super {
    public void show() throws EOFException {
	System.out.println("Super class method");
    }
}

class Sub extends Super {
    // @Override
    // public void show() throws IOException // ❌ Compile-time error
    {
	System.out.println("Sub class method");
    }
}

public class MethodOverridingWithChecked {
    public static void main(String[] args) {
    }
}