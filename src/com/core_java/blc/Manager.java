package com.core_java.blc;

public class Manager {
    private int managerId;
    private String managerName;
    private double managerSalary;

    // Setter method
    public void setManagerData(int id, String name, double salary) {
        managerId = id;
        managerName = name;
        managerSalary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Manager [managerId=" + managerId 
               + ", managerName=" + managerName 
               + ", managerSalary=" + managerSalary + "]";
    }
}
