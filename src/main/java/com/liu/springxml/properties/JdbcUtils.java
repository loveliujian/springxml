package com.liu.springxml.properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
	
	private Properties properties;
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(properties.getProperty("jdbc.driverClassName"));
		Connection conn = DriverManager.getConnection(
											properties.getProperty("jdbc.url"), 
											properties.getProperty("jdbc.username"), 
											properties.getProperty("jdbc.password")
						  );
		return conn;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
