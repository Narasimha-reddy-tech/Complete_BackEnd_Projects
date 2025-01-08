package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedTest {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int id=20;
		String name="kalki";
		String add="bali";
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_dec16", "root", "Vvsnr6303@#");

		PreparedStatement psmt=conn.prepareStatement("insert into stud values(?,?,?)");
		
		  psmt.setInt(1,id );
		  psmt.setString(2, name);
		  psmt.setString(3,add);
		  
		 int exe=   psmt.executeUpdate();	
		 
		 conn.close();
		 
		 System.out.println("updated insert :"+exe);
		  
	}
}
