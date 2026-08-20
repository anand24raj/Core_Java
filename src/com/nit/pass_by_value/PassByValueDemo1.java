package com.nit.pass_by_value;

public class PassByValueDemo1 {

    void main() {

        int y = 200;
        IO.println("Original Value: " + y); // 200

        accept(y);

        IO.println("After calling accept method: " + y); // 200
    }

    // This method changes the value of x locally only
    static void accept(int x) {
        x = x + 50;
    }
}
