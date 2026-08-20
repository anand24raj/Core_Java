package com.nit.Array;

// WAP to find duplicate Course based on id (Nested Loop Logic)

record Course(Integer id, String name, Double price) 
{

}

public class ArrayEx17DupCourse 
{
    public static void main(String[] args) 
    {
        Course[] courses = new Course[6];

        courses[0] = new Course(1, "Java", 35000D);
        courses[1] = new Course(2, "HTML", 12000D);
        courses[2] = new Course(3, "C Lang", 18000D);
        courses[3] = new Course(4, "CSS", 11000D);
        courses[4] = new Course(1, "Java", 35000D);
        courses[5] = new Course(3, "C Lang", 18000D);

        boolean isDuplicate = false;

        for (int i = 0; i < courses.length; i++) 
        {
            for (int j = i + 1; j < courses.length; j++) 
            {
                if (courses[i].id().equals(courses[j].id())) 
                {
                    IO.println("Duplicate course Found with Id : " + courses[j].id());
                    isDuplicate = true;
                }
            }
        }

        if (!isDuplicate) 
        {
            IO.println("Duplicate Course Not found!!");
        }
    }
}