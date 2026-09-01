package com.core_java.oops.has_a_reln;

public class Car {
    private String carName;
    private int carModel;
    private final Engine engine; // HAS-A relationship (Composition)

    public Car(String carName, int carModel) {
        this.carName = carName;
        this.carModel = carModel;
        this.engine = new Engine("Battery", 1200); // Composition
    }

    @Override
    public String toString() {
        return "Car [carName=" + carName +
               ", carModel=" + carModel +
               ", engine=" + engine + "]";
    }
}
