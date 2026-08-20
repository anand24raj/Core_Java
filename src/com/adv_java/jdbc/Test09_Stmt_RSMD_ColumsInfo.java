/* Program #9: Below program shows retriving and printing columns details
*/

package com.adv_java.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Test09_Stmt_RSMD_ColumsInfo {
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

	// 4. Preparing select query
	String selectQuery = """
		SELECT course_id, course_name, course_fee
		FROM   course ORDER BY course_id""";

	// 5. Executing the above select query and obtaining RS object
	ResultSet rs = stmt.executeQuery(selectQuery);

	// 6. Obtaining RSMD object from RS object
	ResultSetMetaData rsmd = rs.getMetaData();

	// 7. printing columns information of Course table
	IO.println("\ncolumns count: " + rsmd.getColumnCount());

	IO.println("\ncolumn1 name: " + rsmd.getColumnName(1) + ", " + rsmd.getColumnLabel(1));
	IO.println("column2 name: " + rsmd.getColumnName(2) + ", " + rsmd.getColumnLabel(2));
	IO.println("column3 name: " + rsmd.getColumnName(3) + ", " + rsmd.getColumnLabel(3));

	IO.println("\ncolumn1 type: " + rsmd.getColumnTypeName(1));
	IO.println("column2 type: " + rsmd.getColumnTypeName(2));
	IO.println("column3 type: " + rsmd.getColumnTypeName(3));

	IO.println("\ncolumn1 size: " + rsmd.getColumnDisplaySize(1) + ", " + rsmd.getPrecision(1) + ", "
		+ rsmd.getScale(1));
	IO.println("column2 size: " + rsmd.getColumnDisplaySize(2) + ", " + rsmd.getPrecision(2) + ", "
		+ rsmd.getScale(2));
	IO.println("column3 size: " + rsmd.getColumnDisplaySize(3) + ", " + rsmd.getPrecision(3) + ", "
		+ rsmd.getScale(3));

	// above code is static nature code,
	// because we must add same Sopln code for each new column

	IO.println();

	// Below code is dynamic code, displays all columns informations
	// This code display columns information exactly like it displayed on SQLPlus
	// window
	for (int i = 1; i <= rsmd.getColumnCount(); i++) {
	    IO.print("  " + rsmd.getColumnName(i) + "\t" + rsmd.getColumnTypeName(i) + "(" + rsmd.getPrecision(i)
		    + ")\n");
	}

	// 8.closing connections
	rs.close();
	stmt.close();
	con.close();
	IO.println("Resources Closed");
    }
}