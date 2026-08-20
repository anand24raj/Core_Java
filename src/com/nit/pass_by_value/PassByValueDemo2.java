package com.nit.pass_by_value;

public class PassByValueDemo2 {

    void main() {

        int y = 200;
        IO.println("Original Value: " + y); // 200

        y = accept(y); // return value used to update y

        IO.println("After calling accept method: " + y); // 250
    }

    static int accept(int x) {
        x = x + 50;
        return x;
    }
}
