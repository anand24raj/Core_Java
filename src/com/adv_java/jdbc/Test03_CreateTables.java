package com.adv_java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test03_CreateTables {

    public static void main(String[] args) {

	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;

	try {
	    // 1. Load Driver
	    Class.forName("oracle.jdbc.OracleDriver");
	    System.out.println("Driver Loaded Successfully");

	    // 2. Establish Connection
	    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava", "123");

	    System.out.println("Connection Established");

	    // 3. Create Statement
	    stmt = con.createStatement();
	    System.out.println("Statement Created");

	    // 4. Display Connected User and Container
	    rs = stmt.executeQuery("SELECT USER, SYS_CONTEXT('USERENV','CON_NAME') FROM dual");

	    if (rs.next()) {
		System.out.println("Connected User : " + rs.getString(1));
		System.out.println("Container      : " + rs.getString(2));
	    }

	    // 5. Check whether COURSE table exists
	    rs = stmt.executeQuery("SELECT COUNT(*) FROM user_tables WHERE table_name='COURSE'");

	    rs.next();

	    if (rs.getInt(1) == 0) {

		stmt.executeUpdate("CREATE TABLE COURSE (" + "COURSE_ID NUMBER(4) PRIMARY KEY,"
			+ "COURSE_NAME VARCHAR2(50) UNIQUE NOT NULL," + "COURSE_FEE NUMBER(7,2))");

		System.out.println("COURSE table created successfully.");

	    } else {
		System.out.println("COURSE table already exists.");
	    }

	    // 6. Check whether STUDENT table exists
	    rs = stmt.executeQuery("SELECT COUNT(*) FROM user_tables WHERE table_name='STUDENT'");

	    rs.next();

	    if (rs.getInt(1) == 0) {

		stmt.executeUpdate("CREATE TABLE STUDENT (" + "SID NUMBER(4) PRIMARY KEY,"
			+ "SNAME VARCHAR2(20) NOT NULL," + "COURSE_ID NUMBER(4)," + "FEE NUMBER(7,2),"
			+ "FOREIGN KEY (COURSE_ID) REFERENCES COURSE(COURSE_ID))");

		System.out.println("STUDENT table created successfully.");

	    } else {
		System.out.println("STUDENT table already exists.");
	    }

	    System.out.println("Program Executed Successfully.");

	} catch (Exception e) {
	    e.printStackTrace();
	} finally {

	    try {
		if (rs != null)
		    rs.close();
		if (stmt != null)
		    stmt.close();
		if (con != null)
		    con.close();

		System.out.println("Resources Closed");

	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}
    }
}