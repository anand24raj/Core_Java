/*Program #5: Develop a program to insert rows in course table 
        In this program we must use "stmt.executeUpdate(insertQuery)" method
	
	1. Insert queries 
		INSERT INTO course(course_id, course_name, course_fee)
		VALUES(course_seq.nextval, 'Core Java', 3500);
 
		INSERT INTO course(course_id, course_name, course_fee)
		VALUES(course_seq.nextval, 'Oracle', 2500);
		
		INSERT INTO course(course_id, course_name, course_fee)
		VALUES(course_seq.nextval, 'HTML, CSS, JS', 2500);
		
		INSERT INTO course(course_id, course_name, course_fee)
		VALUES(course_seq.nextval, 'Adv Java', 3500);*/

package com.adv_java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test05_Stmt_InsertRows 
{
    public static void main(String[] args)throws ClassNotFoundException, SQLException 
    {
        try 
        {
            // 1️ Load Oracle Driver
            Class.forName("oracle.jdbc.OracleDriver");
            IO.println("Driver Loaded");

            // 2️ Connect to Database
	    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/FREEPDB1", "advancejava","123");
    	    IO.println("Connection is created");

            // 3️ Create Statement
            Statement stmt = con.createStatement();
            IO.println("Statement is created");
            
            stmt.executeUpdate("INSERT INTO course(course_id, course_name, course_fee) VALUES(course_seq.nextval, 'Core Java', 3500)");
            stmt.executeUpdate("INSERT INTO course(course_id, course_name, course_fee) VALUES(course_seq.nextval, 'Oracle', 2500)");
            stmt.executeUpdate("INSERT INTO course(course_id, course_name, course_fee) VALUES(course_seq.nextval, 'HTML, CSS, JS', 2500)");
            stmt.executeUpdate("INSERT INTO course(course_id, course_name, course_fee) VALUES(course_seq.nextval, 'Adv Java', 3500)");
            
            con.commit();
            
            IO.println("Rows Inserted Successfully");

            stmt.close();
            con.close();
            IO.println("Resources Closed");

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}