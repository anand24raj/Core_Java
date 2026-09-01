package com.core_java.blc;

public class Circle {
    public static void getAreaOfCircle(double radius) {
        // When the return type is void, print the data inside the method
        final double PI = 3.1415;

        // Validation of radius
        if (radius <= 0) {
            System.out.println("Error: radius value cannot be zero or negative");
            System.exit(0); // shutdown the JVM
        }

        double area = PI * radius * radius;
        System.out.printf("Area of circle is %.2f\n", area);
    }
}
