package com.nit.loose_coupling_arcitecture;

public class LooseCoupling
{

    public static void main(String[] args) 
    {
        Restaurant.prepareHotDrink(new Tea());
        Restaurant.prepareHotDrink(new Coffee());
        Restaurant.prepareHotDrink(new Boost());
    }
}
