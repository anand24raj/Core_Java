package com.nit.pass_by_value;

public class PassByValueDemo5 {
    void main() {
        String s1 = new String("Java"); // Immutable
        IO.println("Before modification: " + s1);

        accept(s1);

        IO.println("After modification: " + s1);
        // String is immutable, so the original object is NOT modified
    }

    // Static method because main is static
    public static void accept(String str) {
        str = str.toUpperCase(); // Creates a new String object
        IO.println("Inside accept(): " + str);
    }
}
