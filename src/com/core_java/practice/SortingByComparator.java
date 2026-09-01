package com.core_java.practice;
import java.util.Arrays;
import java.util.Comparator;

class Students {

	int StudentID;
	String StudentName;
	double StudentSalary;

	public Students(Integer studentID, String studentName, Double studentSalary) {
		StudentID = studentID;
		StudentName = studentName;
		StudentSalary = studentSalary;
	}

	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", StudentName=" + StudentName + ", StudentSalary=" + StudentSalary
				+ "]";
	}
}

public class SortingByComparator {

	public static void main(String[] args) {

		Students s[] = { new Students(102, "Rahul", 12000.0), new Students(103, "Anish", 2000.0),
				new Students(101, "Virat", 8000.0) };

//		Comparator<Students> sortById = (s1, s2) -> Integer.compare(s1.StudentID, s2.StudentID);
//		Arrays.sort(s, sortById);
//		System.out.println("Sort by ID : ");
		
		
//		Comparator<Students> sortByName = (s1, s2) -> s1.StudentName.compareTo(s2.StudentName);
//		Arrays.sort(s, sortByName);
//		System.out.println("Sort by Name : ");
		
//		Comparator<Students> sortBySalary = (s1, s2) -> Double.compare(s1.StudentSalary, s2.StudentSalary);
//		Arrays.sort(s, sortBySalary);
//		System.out.println("Sort by Salary : ");
//		
//		for (Students stu : s) {
//			System.out.println(stu);
//		}

		  Arrays.sort(s,new Comparator<Students>() {

			@Override
			public int compare(Students o1, Students o2) {
				
				return o1.StudentID - o2.StudentID;
				
				
			}
		});

			for (Students stu : s) {
				System.out.println(stu);
			}
	}
}
