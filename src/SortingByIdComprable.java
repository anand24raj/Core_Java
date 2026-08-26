import java.util.Arrays;

// compartor 
//  sort by id
// sort by name
// sort by sal

//  annomous 
//  lambda -> (s1,s2)->

class Student implements Comparable<Student> {
	Integer StudentID;
	String StudentName;
	Double StudentSalary;

	public Student(Integer studentID, String studentName, Double studentSalary) {
		super();
		StudentID = studentID;
		StudentName = studentName;
		StudentSalary = studentSalary;
	}

	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", StudentName=" + StudentName + ", StudentSalary=" + StudentSalary
				+ "]";
	}

	@Override
	public int compareTo(Student o) {

		// return this.StudentID - o.StudentID;

		// return Double.compare(o.StudentSalary, this.StudentSalary);

		return this.StudentName.compareTo(o.StudentName);
	}

}

public class SortingByIdComprable {
	public static void main(String[] args) {

		// int size=Integer.parseInt(IO.readln("enter size"));
//		 Student[] s=new Student[size];
//		 
//		 
//		 // int a[]=new int[];
//		 
//		   for(int i=0;i<size;i++)
//		   {
//			   int id=Integer.parseInt(IO.readln("enter  id"));
//			   String name=IO.readln("Enter the name");
//			   double sal=Double.parseDouble(IO.readln("enter sal"));
//			   s[i]=new Student(id, name, sal);
//		   }

		Student s[] = { new Student(102, "Rahul", 12000.0), new Student(103, "Anish", 2000.0),
				new Student(101, "Virat", 8000.0)
		};
		Arrays.sort(s); //

		for (Student stu : s) {
			System.out.println(stu);
		}
	}

}
