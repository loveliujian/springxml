package com.liu.springxml.properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils2 {
	
	private String driverClassName;
	
	private String url;
	
	private String username;
	
	private String password;
	
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(driverClassName);
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
	

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
