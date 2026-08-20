/*Program #7: Develop a program to delete rows in course table where course_name contians 'Cr'*/

package com.adv_java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test07_Stmt_DeleteRows {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try {
	    Class.forName("oracle.jdbc.OracleDriver");
	    IO.println("Driver is loaded");

	    // 2. Establishing connection
	    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava",
		    "123");

	    IO.println("Connection is created");

	    // 3. Creating Statement object
	    Statement stmt = con.createStatement();
	    IO.println("Statement is created");

	    String deleteQuery = "DELETE FROM course WHERE course_name LIKE '%Cr%'";
	    int rows = stmt.executeUpdate(deleteQuery);

	    IO.println(rows + " Rows Deleted Successfully");

	    stmt.close();
	    con.close();
	    IO.println("Resources Closed");

	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}