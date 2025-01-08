package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Login_page {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter the user name");
		    String uname=sc.next();
		    System.out.println("enter the password");
		    String passwd=sc.next();
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/my_dec16","root", "Vvsnr6303@#");
        
        PreparedStatement pstmt= conn.prepareStatement("select * from login where username=? and password=?");
        
        pstmt.setString(1,uname);
        pstmt.setString(2, passwd);
        
       ResultSet res= pstmt.executeQuery();
       
       if(res.next()) {
    	   System.out.println("login successful.. welcome to homepage");
       }
       else {
    	   System.out.println("login denied");
       }
        conn.close();
        
        
        }
}
