/**
Develop a program to display columns names and rows data
exactly like displayed on sql plus window 

  COURSE_ID COURSE_NAME                    COURSE_FEE
---------- ------------------------------ ----------
         1 Core Java                            3500
         2 Oracle                               2500
         3 HTML, CSS, JS                        2000
         4 Adv Java                             3500
 */

//Tet10_Stmt_ColumnsRowsDetails.java
package com.adv_java.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Test11_SQLPlusFormat_DisplayColumnsRows {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// 1. Loading oracle driver
	Class.forName("oracle.jdbc.OracleDriver");
	IO.println("Driver Loaded");

	// 2. Establishing connection
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava", "123");
	IO.println("Connection is created");

	// 3. Creating Statement object
	Statement stmt = con.createStatement();
	IO.println("Statement Created");

	// 4. executing query and obtain RS object
	ResultSet rs = stmt.executeQuery("select * from course");

	// 5. retrieving and printing columns and rows with validations
	int rowCount = 0;

	if (rs.next()) {
	    // obtaining RSMD object
	    ResultSetMetaData rsmd = rs.getMetaData();

	    // printing columns names
	    int maxGap;
	    String columnName, frmMsg;
	    int columnCount = rsmd.getColumnCount();

	    for (int i = 1; i <= columnCount; i++) {
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

	    // printing line to separate column names and rows data
	    for (int i = 1; i <= columnCount; i++) {
		columnName = rsmd.getColumnName(i);
		maxGap = Math.max(rsmd.getPrecision(i), columnName.length());

		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < maxGap; j++) {
		    sb.append("-");
		}
		IO.print(sb + " ");
	    }
	    IO.println();

	    // printing rows data
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

	// 8. close connections
	rs.close();
	stmt.close();
	con.close();

	IO.println("Resources Closed");
    }
}