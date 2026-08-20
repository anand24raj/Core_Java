package com.nit.instance_of_optr;

class A 
{
}

class B extends A 
{
}

class C extends B 
{
}

public class InstanceofDemo3 
{
    public static void main(String[] args) 
    {

        C c1 = new C();

        if (c1 instanceof C)
        {
            IO.println("c1 is pointing to C object");
        }    

        if (c1 instanceof B)
        {
            IO.println("c1 is pointing to B memory");
        }
        
        if (c1 instanceof A)
        {
            IO.println("c1 is pointing to A memory");
        }    

        if (c1 instanceof Object)
        {
            IO.println("c1 is pointing to Object memory");
        }
    }
}
