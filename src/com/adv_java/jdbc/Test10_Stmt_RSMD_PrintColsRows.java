/*Program #10: Develop a program to display a table's columns names and its row data 
   by using ResultSet and ResultSetMetaData
   Output must be printed as below like it is displayed on Sql Plus

   =============================================================================
    COURSE_ID COURSE_NAME                                        COURSE_FEE
   ---------- -------------------------------------------------- --------------
            1 Core Java                                              3500
            2 Oracle                                                 2500
            3 HTML, CSS, JS                                          2500
            4 Adv Java                                               3500
   =================================================================================
	//Test10_Stmt_RS_RSMD_PrintColsRows_Course.java */

package com.adv_java.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Test10_Stmt_RSMD_PrintColsRows {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// 1. Loading driver
	Class.forName("oracle.jdbc.OracleDriver");
	IO.println("Driver is loaded");

	// 2. Establishing connection
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava", "123");
	IO.println("Connection is created");

	// 3. Creating Statement object
	Statement stmt = con.createStatement();
	IO.println("Statement is created");

	// 4. Executing SELECT Query and obtains ResultSet and RSMD objects
	ResultSet rs = stmt.executeQuery("SELECT * FROM course");
	ResultSetMetaData rsmd = rs.getMetaData();

	// 5. Fetching Columns and Rows RSMD and RS
	int count = 0;
	if (rs.next()) {
	    for (int i = 1; i <= rsmd.getColumnCount(); i++) {
		IO.print(rsmd.getColumnName(i) + "\t\t");
	    }
	    IO.println("\n-------------------------------------------------------------");
	    do {
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
		    IO.print(rs.getString(i) + "\t\t\t");
		}
		IO.println();
		count++;
	    } while (rs.next());

	    IO.println("\n" + count + " rows selected");

	} else {
	    IO.println("no rows selected");
	}

	// 6. closing connections
	rs.close();
	stmt.close();
	con.close();
	IO.println("Resources Closed");
    }
}