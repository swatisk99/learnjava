//$Id$
package com.cruds.leads;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class DBUtil {
	
	public static Connection getConnection() throws SQLException {
		BasicDataSource ds = new BasicDataSource();
		String DB_URL = "jdbc:mysql://localhost:3306/learn";
		String DB_USER = "root";
		String DB_PASS = "Amma@1965";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUsername(DB_USER);
			ds.setUrl(DB_URL);
			ds.setPassword(DB_PASS);
			return ds.getConnection();
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
}
