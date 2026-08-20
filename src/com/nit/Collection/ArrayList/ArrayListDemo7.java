package com.nit.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

record Professor(String name, String specialization) {}

class Department 
{
    private String name;
    private List<Professor> professors;

    public Department(String name) 
    {
        this.name = name;
        professors = new ArrayList<>(); // Composition
    }

    public void addProfessor(Professor professor) 
    {
        professors.add(professor);
    }

    public String getName() 
    {
        return name;
    }

    public List<Professor> getProfessors() 
    {
        return professors;
    }
}

public class ArrayListDemo7 
{
    public static void main(String[] args) 
    {
        Department cs = new Department("Computer Science");

        cs.addProfessor(new Professor("Dr James", "Java"));
        cs.addProfessor(new Professor("Dr Smith", "Python"));
        cs.addProfessor(new Professor("Dr John", ".NET"));

        IO.println("List of professors in " + cs.getName() + " department:");

        List<Professor> professors = cs.getProfessors();

        for (Professor professor : professors) 
        {
            IO.println(professor);
        }
    }
}