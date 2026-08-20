package com.nit.elc;

import com.nit.blc.Employee2;

public class EmployeeDemo1 {

    void main() {

        Employee2 raj = new Employee2();
        raj.setEmployeeData(101, "Scott", 40000);
        raj.calculateEmployeeGrade();
        raj.getEmployeeData();
    }
}

