package com.training.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class FetchDemo {
	public static void main(String[] args) //throws SQLException, ClassNotFoundException 
	{
	Connection conn=null ;
		Statement st = null;
		ResultSet rs = null;
		try {

		//Driver driver = new com.mysql.cj.jdbc.Driver();
		//DriverManager.registerDriver(driver);
		//conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "root"); */
		
		Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "sai");
			System.out.println("connection=" + conn);
			st = conn.createStatement();
			rs = st.executeQuery("select * from employee");
			System.out.println("Id \t\t Name \t\t Salary ");
			while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t\t " + rs.getString(2) + "\t\t " + rs.getString(3) + "\t\t "
						+ rs.getString(4));
				//System.out.println(rs.getInt("id") + "\t\t" + rs.getString("name")+"\t\t"+rs.getDouble("salary") );

			}
		}
	
		 catch (ClassNotFoundException e) {
		 //System.out.println(e.getMessage());
		// e.printStackTrace();
		  System.out.println("Driver file not loaded"); 
		  }
		 
		catch (SQLException e) {
			System.out.println(e.getErrorCode() + " " + e.getMessage());
			//e.printStackTrace();
			
		}
		finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				System.out.println(e.getErrorCode() + " " + e.getMessage());
			}

		}
	}
}
