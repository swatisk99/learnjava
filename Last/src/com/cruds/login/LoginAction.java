package com.cruds.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	String userName;
	String password;
	public String execute(){
		if(UserDBUtil.authenticateUser(userName, password)) {
			ActionContext.getContext().getSession().put("userName", getUserName());
			if(UserDBUtil.authorizeUser(userName, password)) {
				ActionContext.getContext().getSession().put("isAdmin", "true");
			}
			return SUCCESS;
		}
		else {
			ActionContext.getContext().getSession().put("loginAttempted", "true");
			return INPUT;
		}
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
