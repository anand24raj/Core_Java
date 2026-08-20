/*
 *	Develop a program to insert rows in course table with dynamic values
 *  read those values from the keyboard
 *  
 *    query syntax:
 *    	
 *    	"INSERT INTO course(course_id, course_name, course_fee)\n" +
 *      "VALUES("+courseId+", '"+courseName+"', "+couseFee+")";
 */

//Test15_Stmt_DynamicValues.java 

package com.adv_java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test15_Stmt_DynamicValues {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try (
		// 1. Establishing connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava",
			"123");

		// 2. Creating Statement object
		Statement stmt = con.createStatement();) {
	    String option = "N";
	    do {
		int courseId = Integer.parseInt(IO.readln("Enter courseId\t: "));
		String courseName = IO.readln("Enter courseName\t: ");
		double courseFee = Double.parseDouble(IO.readln("Enter courseFee\t: "));

		// 3. Executing dynamic INSERT query
		stmt.executeUpdate("INSERT INTO course(course_id, course_name, course_fee)\n" + "VALUES(" + courseId
			+ ", '" + courseName + "', " + courseFee + ")");

		IO.println("1 row inserted.");

		option = IO.readln("\nDo you want to continue(Y/N)?: ");

	    } while (option.equalsIgnoreCase("Y"));

	    IO.println("_/\\_ Thank you, Visit Again _/\\_");

	} catch (SQLException e) {
	    e.printStackTrace();
	}
    }
}