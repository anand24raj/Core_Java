package com.core_java.interfaces.record_demo;

public class ClassAndRecordComparison 
{
    public static void main(String[] args) 
    {
        // ===== Class Features =====
        EmployeeClass cls1 = new EmployeeClass(111, "Scott");
        IO.println(cls1);

        EmployeeClass cls2 = new EmployeeClass(111, "Scott");
        IO.println(cls1.equals(cls2));

        IO.println(cls1.hashCode() + " : " + cls2.hashCode());

        IO.println(cls1.getId() + " : " + cls1.getName());

        IO.println("....................");
        
        EmployeeRecord rec1 = new EmployeeRecord(-222, "Raj");
        IO.println(rec1);
       
        EmployeeRecord rec2 = new EmployeeRecord(222, "Raj");

        IO.println(rec1.equals(rec2));

        IO.println(rec1.hashCode() + " : " + rec2.hashCode());

        IO.println(rec1.id() + " : " + rec1.name());
    }
}
