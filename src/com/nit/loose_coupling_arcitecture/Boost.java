package com.nit.loose_coupling_arcitecture;

public class Boost implements HotDrink 
{

    @Override
    public void prepare() 
    {
        IO.println("Preparing Boost");
    }
}
