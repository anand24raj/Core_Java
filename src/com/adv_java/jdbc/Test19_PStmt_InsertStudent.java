//Test19_PStmt_InsertStudent.java
package com.adv_java.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test19_PStmt_InsertStudent {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava",
		"123");

		PreparedStatement insertPstmt = con.prepareStatement("""
			INSERT INTO student(sid, sname, course_id, fee)
			VALUES(student_seq.nextval, ?, ?, ?)	""");

		PreparedStatement courseIdPstmt = con.prepareStatement("""
			SELECT course_id from course
			where course_name=?""")) {
	    String option = "N";
	    do {
		// 1. reading sname
		String sname = IO.readln("Enter sname\t: ");

		// 2. reading courseName and retrieving courseId from DB course table
		int courseId;
		while (true) {
		    String courseName = IO.readln("Enter course\t: ");
		    courseIdPstmt.setString(1, courseName);

		    try (ResultSet rs = courseIdPstmt.executeQuery()) {
			if (rs.next()) {
			    courseId = rs.getInt(1);
			    break;
			} else {
			    IO.println("Error: The entered course '" + courseName + "' is not available");
			    IO.println("Choose one of the below courses");

			    try (Statement stmt = con.createStatement(); ResultSet rs2 = stmt.executeQuery("""
			    	SELECT course_name
			    	FROM course
			    	ORDER BY course_id""");) {
				int serialNum = 1;
				while (rs2.next()) {
				    IO.println(serialNum + ". " + rs2.getString(1));
				    serialNum++;
				}
			    } catch (SQLException e) {
				e.printStackTrace();
			    }

			} // else close

		    } catch (SQLException e) {
			e.printStackTrace();
		    } // outer try-catch close

		} // while(true) close

		// 3. reading course fee
		double fee = Double.parseDouble(IO.readln("Enter fee\t: "));

		// ==================================================================
		// 4. setting sname, courseId and fee to insert query
		insertPstmt.setString(1, sname);
		insertPstmt.setInt(2, courseId);
		insertPstmt.setDouble(3, fee);

		// 5. executing inserting query
		insertPstmt.executeUpdate();
		IO.println("1 row inserted");

		option = IO.readln("\nDo you want to continue(Y/N)?: ");

	    } while (option.equalsIgnoreCase("Y"));

	    IO.println("Thank you, tata, bye, bye, see you!");

	} // try-with-resource end -> [con and pstmt] objects are closed

	catch (SQLException e) {
	    e.printStackTrace();
	}

    }// main close

}// class close