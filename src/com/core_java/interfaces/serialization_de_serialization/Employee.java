package com.core_java.interfaces.serialization_de_serialization;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable 
{

    // Version in-compatibility
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private transient Double salary;
    private transient LocalDate hireDate;

    private Employee(Integer id, String name, Double salary, LocalDate hireDate) 
    {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public static Employee getEmployeeObject(Integer id, String name, Double salary, LocalDate hireDate) 
    {
        Employee E1 = new Employee(id, name, salary, hireDate);
        return E1;
    }

    @Override
    public String toString() 
    {
        return "Employee [id=" + id + ", name=" + name +
                ", salary=" + salary + ", hireDate=" + hireDate + "]";
    }
}