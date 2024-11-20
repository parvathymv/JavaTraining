package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.training.util.DBHandler;

public class PreparedStatementDemo {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs=null;
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		int regno, m1, m2, m3;
		String name;
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "admin@123");
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DBHandler.getConnection();
			//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "PARSYS", "parmv@2002");
			st = conn.prepareStatement("insert into student(regno,sname,subject1,subject2,subject3) values(?,?,?,?,?)");
			System.out.println("Enter reg number,name and marks is 3 subjects");
			// to isert
			regno = scanner.nextInt();
			scanner.nextLine();
			name = scanner.nextLine();
			m1 = scanner.nextInt();
			m2 = scanner.nextInt();
			m3 = scanner.nextInt();
			st.setInt(1, regno);
			st.setString(2, name);
			st.setInt(3, m1);
			st.setInt(4, m2);
			st.setInt(5, m3);
			result = st.executeUpdate();
			System.out.println(result + " row inserted");
			// to update total for a specific student
			System.out.println("Enter regno to update total");
			regno = scanner.nextInt();
			st = conn.prepareStatement("update student set total=subject1+subject2+subject3 where regno=?");
			st.setInt(1, regno);
			result = st.executeUpdate();
			System.out.println(result + "rows updatcd");
			//to display students with total > 400
			st=conn.prepareStatement("select regno,sname,total from student where total>?");
			System.out.println("Enter total");
			int total=scanner.nextInt();
					st.setInt(1,total);
			rs=st.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("regno") + " "+ rs.getInt("total"));
			}
		} /*catch (ClassNotFoundException ex) {
			System.out.println("Driver not loaded");
		}*/
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}

//preparedstatement is precompiled
//parameterized queries
