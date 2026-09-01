package com.core_java.Java8.Comparable;

// Record Employee implementing Comparable
// Sorting will be based on Employee id (Natural Ordering)

public record Employee(Integer id, String name, Double salary)implements Comparable<Employee> 
{

    @Override
    public int compareTo(Employee e2) 
    {
        // Compare based on id
        return this.id().compareTo(e2.id());

        /*
        Alternative logic:

        if (this.id().equals(e2.id()))
            return 0;
        else if (this.id() > e2.id())
            return 1;
        else
            return -1;
        */
    }
}