//$Id$
package com.cruds.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cruds.leads.DBUtil;
import com.cruds.leads.LeadInfo;

public class UserDBUtil {
	public static final String INSERT_USER_SQL = "INSERT INTO USERS " + "(USERNAME, EMAIL, PASSWORD) VALUES " + "(?, ?, ?);";
	public static final String SELECT_USER_SQL = "SELECT * FROM USERS WHERE (USERNAME = BINARY"+" ?" + " AND PASSWORD = BINARY "+"?)";
	public static boolean authenticateUser(String userName, String password) {
		User user = null;
		try(Connection con = DBUtil.getConnection()){
			PreparedStatement stmt = con.prepareStatement(SELECT_USER_SQL);
			stmt.setString(1, userName);
			stmt.setString(2, password);
			ResultSet result = stmt.executeQuery();	
			while(result.next()) {
				System.out.println(result.getString("USERNAME"));
				return true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	
	public static boolean signupUser(User user) {
		int rowUpdated = 0;
		try(Connection con = DBUtil.getConnection()){
			PreparedStatement stmt = con.prepareStatement(INSERT_USER_SQL);
			stmt.setString(1, user.getUserName());
			stmt.setString(2, user.getEmail());
			stmt.setString(3, user.getPassword());
			rowUpdated = stmt.executeUpdate();	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return rowUpdated>0;
	}
}
