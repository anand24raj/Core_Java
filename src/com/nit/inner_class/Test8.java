package com.nit.inner_class;

class University {
    private String name;

    public University(String name) {
        this.name = name;
    }

    public void displayUniversityName() {
        IO.println("University Name: " + name);
    }

    public class Department {
        private String name;
        private String headOfDepartment;

        public Department(String name, String hod) {
            this.name = name;
            this.headOfDepartment = hod;
        }

        public void displayDepartmentDetails() {
            displayUniversityName();
            IO.println("Department Name: " + name);
            IO.println("Head of Department: " + headOfDepartment);
        }
    }
}

public class Test8 {
    public static void main(String[] args) {
        University uni = new University("JNTU");

        University.Department cs =
                uni.new Department("Computer Science", "Dr. John");
        University.Department ee =
                uni.new Department("Electrical Engineering", "Dr. Scott");

        cs.displayDepartmentDetails();
        ee.displayDepartmentDetails();
    }
}

