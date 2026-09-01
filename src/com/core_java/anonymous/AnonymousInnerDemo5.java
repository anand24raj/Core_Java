package com.core_java.anonymous;

interface HotDrink {
    void prepare();
}

class Restaurant {
    public static HotDrink getHotDrink() {

        return new HotDrink() {
            @Override
            public void prepare() {
                IO.println("Preparing Tea");
            }
        };
    }
}

public class AnonymousInnerDemo5 {
    public static void main(String[] args) {
        HotDrink drink = Restaurant.getHotDrink();
        drink.prepare();
    }
}
