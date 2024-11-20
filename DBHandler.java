package com.training.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHandler {
	private static Connection connection = null;
	private static Properties properties = new Properties();

	public static Connection getConnection()  {
		try {
			
			FileInputStream fileInputStream = new FileInputStream("db.properties");
			properties.load(fileInputStream);
			String driver=properties.getProperty("driver");
			Class.forName(driver);

			connection = DriverManager.getConnection(properties.getProperty("url"),
					properties.getProperty("username"), properties.getProperty("password"));
			//System.out.println(connection);
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}

		return connection;
	}
	

}