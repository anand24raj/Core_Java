package com.core_java.interfaces.record_demo;

public record EmployeeRecord(int id, String name) 
{
    // Compact Constructor
    public EmployeeRecord
    {
        if (id <= 0)
        {
            throw new IllegalArgumentException("Id is invalid");
        }
    }
}
