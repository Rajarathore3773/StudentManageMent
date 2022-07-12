package com.zensar.StudentManagement.repository;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionProvider {

	static Connection con=null;

public static Connection getConnection() {
try {
	Properties properties = new Properties();
	try {
		properties.load(new FileReader("db.properties"));
		String driverName =properties.getProperty("driver");
		String jdbcUrl =properties.getProperty("jdbcUrl");
		String userName =properties.getProperty("username");
		String password =properties.getProperty("Password");
	Class.forName(driverName);
	con=DriverManager.getConnection(jdbcUrl,userName, password);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

return con;
}
	}


