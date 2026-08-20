/*
 * ========================================================================================
 * 		PreparedStatement with Select query with join and IN operator
 * ========================================================================================
 *	Develop the a program to retrieve records from Student table
 *  You must display the course name in place of course_id 
 *	
 *				Output must be as below 
 *	  ========================================
 *		sid		sname		course		fee
 *	  ========================================
 *		101		S1		Core Java		3500
 *		102		S2		Core Java		3500
 *		103		S3		Oracle			3000
 *		104		S4		HTML, CSS, JS	2500
 *		104		S5		Adv Java		3500
 *	  =========================================
 *
 * You must give choice to user to retrieve either
 * 		1. All records
 * 		2. Given course records
 * 		3. Given more than one courses records
 * 
 * 		All records query
 *         SELECT *
 *         FROM Student;
 *         
 * 		Given course records
 *         SELECT *
 *         FROM Student
 *         WHERE course_name=?;
 *         
 * 		Given multiple course records
 *         SELECT *
 *         FROM Student
 *         WHERE course_name IN (?, ?, ?, ...) ;
 *
 *                 
 * Queries with join condition to display course name instead of course_id
 * ==========================================================================                
 * 		SELECT  s.sid, s.sname, c.course_name, s.fee
 * 		FROM    student s, course c 
 * 		WHERE   s.course_id=c.course_id;
 * 	===========================================================
 * 		SELECT  s.sid, s.sname, c.course_name, s.fee
 * 		FROM    student s, course c 
 * 		WHERE   s.course_id=c.course_id
 * 		AND 	c.course_name IN ('Core Java');  
 * 	===========================================================
 * 		SELECT  s.sid, s.sname, c.course_name, s.fee
 * 		FROM    student s, course c 
 * 		WHERE   s.course_id=c.course_id
 * 		AND 	c.course_name IN ('Core Java', 'Oracle');  
 * 	===========================================================
 * 
 */
//Test18_Pstmt_SelectQueryWithStreamAPI.java

package com.adv_java.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Properties;

public class Test20_PStmt_SelectStudent_JoinIN {
    public static void main(String[] args) {

	try {
	    // 1. creating Properties object
	    Properties props = new Properties();

	    // 2. loading properties from properties file
	    props.load(Test20_PStmt_SelectStudent_JoinIN.class.getClassLoader()
		    .getResourceAsStream("connectioninfo.properties"));

	    // 3. Reading driver properties from the Properties object
	    final String DB_URL = props.getProperty("DB_URL");
	    final String DB_USN = props.getProperty("DB_USN");
	    final String DB_PWD = props.getProperty("DB_PWD");

	    try (
		    // 2. Establishing connection
		    Connection con = DriverManager.getConnection(DB_URL, DB_USN, DB_PWD);

		    // 3. Creating PreparedStatement object
		    PreparedStatement allCoursesPstmt = con.prepareStatement("""
		    	SELECT  s.sid, s.sname, c.course_name, s.fee
		    	FROM    student s, course c
		    	WHERE   s.course_id=c.course_id
		    	ORDER BY c.course_id, s.sid """);

		    PreparedStatement oneCoursesPstmt = con.prepareStatement("""
		    	SELECT  s.sid, s.sname, c.course_name, s.fee
		    	FROM    student s, course c
		    	WHERE   s.course_id=c.course_id
		    	AND 	c.course_name=?
		    	ORDER BY c.course_id, s.sid""");) {
		loop: while (true) {
		    IO.println("\nChoose one option");
		    IO.println(" 1. All Courses Students");
		    IO.println(" 2. One Course Students");
		    IO.println(" 3. Multiple Course(s) Students");
		    IO.println(" 4. Exit");

		    int option = Integer.parseInt(IO.readln("\nEnter option: "));

		    switch (option) {
		    case 1: { // all courses
			displayRows(allCoursesPstmt);
			break;
		    }
		    case 2: { // given course(s)
			String course = IO.readln("Enter course: ");
			oneCoursesPstmt.setString(1, course);
			displayRows(oneCoursesPstmt);
			break;
		    }
		    case 3: { // reading multiple courses from end-user
			String courses = IO.readln("Enter courses with | separator\n");
			// as "Core Java | Adv Java"

			// Split the courses to use each course separately
			String[] coursesArray = courses.split("\\|");
			// Suppressing | meaning to use it as |

			// Preparing number of place holders (?s) dynamically
			// based on number of courses entered by the user

			// Old Style, Java 7v Style, code with loop and StringBuilder object
			/*
			 * StringBuilder placeholders = new StringBuilder(); for(int i=0;
			 * i<coursesArray.length; i++ ) { placeholders.append("?,"); }
			 * 
			 * //removing last , from this placeholders string int lastCommaIndex =
			 * placeholders.lastIndexOf(","); placeholders.deleteCharAt(lastCommaIndex);
			 */
			// Modern style, Java 8v Stream API style, code
			String placeholders = String.join(",",
				Arrays.stream(coursesArray).map(course -> "?").toArray(String[]::new));

			// substituting placeholders in the query
			String query = """
				SELECT  s.sid, s.sname, c.course_name, s.fee
				FROM    student s, course c
				WHERE   s.course_id=c.course_id
				AND 	c.course_name IN (%s)
				ORDER BY c.course_name, s.sid
				   """.formatted(placeholders);

			// printing final query
			IO.println(query);

			// Creating Pstmt object with this dynamic placeholders query
			try (PreparedStatement givenCoursesPstmt = con.prepareStatement(query)) {
			    // setting given courses, each course separately to the each ?
			    for (int i = 0; i < coursesArray.length; i++) {
				givenCoursesPstmt.setString(i + 1, coursesArray[i].trim());
			    }

			    // executing query
			    displayRows(givenCoursesPstmt);

			} catch (SQLException e) {
			    e.printStackTrace();
			}
			break;
		    }
		    case 4: { // exit
			IO.println("Thank you, Tata Bye Bye");
			break loop;
		    }
		    default: { // invalid option
			IO.println("Invalid option");
			;
		    }
		    }// switch close

		} // while close
	    } // try-with-resources close
	} catch (IOException | SQLException e) {
	    e.printStackTrace();
	}
    }// main close

    private static void displayRows(PreparedStatement pstmt) {
	try (ResultSet rs = pstmt.executeQuery()) {
	    int rowCount = 0;

	    if (rs.next()) {
		ResultSetMetaData rsmd = rs.getMetaData();

		int maxGap;
		String columnName, frmMsg;
		int columnCount = rsmd.getColumnCount();

		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
		    columnName = rsmd.getColumnName(i);

		    // retrieving max of column_size and column_name length
		    maxGap = Math.max(rsmd.getPrecision(i), columnName.length());

		    // printing column_name with the above max gap spaces
		    if (rsmd.getColumnTypeName(i).toLowerCase().contains("varchar")) {
			frmMsg = "%-" + maxGap + "s ";
		    } else {
			frmMsg = "%" + maxGap + "s ";
		    }

		    System.out.printf(frmMsg, columnName);
		}
		IO.println();

		for (int i = 1; i <= columnCount; i++) {
		    columnName = rsmd.getColumnName(i);
		    maxGap = Math.max(rsmd.getPrecision(i), columnName.length());

		    StringBuilder sb = new StringBuilder();
		    sb.repeat("-", maxGap); // repeating - maxGap number of times
		    IO.print(sb + " ");// printing all those multiple -'s
		}
		IO.println();

		do {
		    for (int i = 1; i <= columnCount; i++) {
			columnName = rsmd.getColumnName(i);

			// retrieving max of column_size or column_name length
			maxGap = Math.max(rsmd.getPrecision(i), columnName.length());

			// printing column_value with the above max gap spaces
			if (rsmd.getColumnTypeName(i).toLowerCase().contains("varchar")) {
			    frmMsg = "%-" + maxGap + "s ";
			} else {
			    frmMsg = "%" + maxGap + "s ";
			}

			System.out.printf(frmMsg, rs.getString(i));
		    }
		    rowCount++;
		    IO.println();

		} while (rs.next());
	    }

	    if (rowCount == 1) {
		IO.println("\n" + rowCount + " row selected.");
	    } else {
		IO.println("\n" + rowCount + " rows selected.");
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	}

    }// displyRows() method close

}// class close
