package com.nit.instance_of_optr;

class Bird 
{
}

class Fish 
{
}

public class InstanceofDemo2 
{
    public static void main(String[] args) 
    {

        Bird bird = new Bird();
        
   /*     if (bird instanceof Fish)    // ❌ Compile-time error
        {
        } */

        // incompatible types: Bird cannot be converted to Fish
    }
}
