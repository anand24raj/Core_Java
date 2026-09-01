package com.core_java.oops.loose_coupling_arcitecture;

public class Coffee implements HotDrink 
{

    @Override
    public void prepare() 
    {
        IO.println("Preparing Java beans coffee");
    }
}