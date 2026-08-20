package com.nit.has_a_reln;

public class Engine {
    private String type;
    private int horsePower;

    public Engine(String type, int horsePower) {
        super();
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine [type=" + type + ", horsePower=" + horsePower + "]";
    }
}
