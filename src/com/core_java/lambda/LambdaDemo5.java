package com.core_java.lambda;

interface Shape {
    void draw();
}

public class LambdaDemo5 {
    public static void main(String[] args) {

        String shapeType = "Circle"; // effectively final
        // shapeType = "Square"; ❌ not allowed

        Shape shape = () -> IO.println("Drawing " + shapeType);
        shape.draw();
    }
}

