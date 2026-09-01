package com.core_java.static_method;

// Interface with static methods (Java 8 feature)
public interface Calculator {

    // Static method to calculate sum
    static double doSum(double x, double y) {
        return x + y;
    }

    // Static method to calculate cube
    static double getCube(int num) {
        return num * num * num;
    }
}
