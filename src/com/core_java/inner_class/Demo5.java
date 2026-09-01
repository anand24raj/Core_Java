package com.core_java.inner_class;

// Outer class
public @interface Demo5 
{

    // Nested class
    class A 
    {
       
    }

    // Nested interface
    interface B 
    {
        
    }

    // Nested enum
    enum C 
    {
        // Enum constants must come first
    }

    // Nested record (Java 16+)
    record D() 
    {
    }

    // Nested annotation
    @interface E 
    {
        
    }
}
