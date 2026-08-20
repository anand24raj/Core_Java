package com.nit.inner_class;

class Laptop {
    private String brand;
    private String model;
    private final Motherboard motherboard;

    public Laptop(String brand, String model, String motherboardModel, String chipset) {
        this.brand = brand;
        this.model = model;
        this.motherboard = new Motherboard(motherboardModel, chipset);
    }

    public void switchOn() {
        IO.println("Turning on " + brand + " " + model);
        motherboard.boot();
    }

    // Inner class
    private class Motherboard {
        private String model;
        private String chipset;

        public Motherboard(String model, String chipset) {
            this.model = model;
            this.chipset = chipset;
        }

        public void boot() {
            IO.println("Booting with " + model + " motherboard and " + chipset + " chipset");
        }
    }
}

public class Test6 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("HP", "Gaming", "TRIS", "Intel");
        laptop.switchOn();
    }
}
