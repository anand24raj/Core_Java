package com.core_java.functionalinterface.supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

class Player {
    private int id;
    private String name;
    private double basePrice;
    private LocalDate dateOfJoining;

    public Player(int id, String name, double basePrice, LocalDate dateOfJoining) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Player [id=" + id +
                ", name=" + name +
                ", basePrice=" + basePrice +
                ", dateOfJoining=" + dateOfJoining + "]";
    }
}

public class SupplierDemo3 {
    public static void main(String[] args) {

        Supplier<Player> player = () -> {
            int id = Integer.parseInt(IO.readln("Enter id :"));
            String name = IO.readln("Enter Name : ");
            double price = Double.parseDouble(IO.readln("Enter base price :"));

            // LocalDate.now() → current system date
            return new Player(id, name, price, LocalDate.now());
        };

        Player obj = player.get();
        IO.println(obj);
    }
}
