package com.nit.loose_coupling_arcitecture;

public class Tea implements HotDrink 
{

    @Override
    public void prepare() 
    {
        IO.println("Preparing Irani Tea!!!");
    }
}