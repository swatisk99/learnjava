package com.cruds.login;

import java.io.IOException;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SignupAction extends ActionSupport {
	String userName;
	String email;
	String password;
	public String execute() {
		if(UserDBUtil.signupUser(new User(userName,email,password))) {
			ActionContext.getContext().getSession().put("userName", userName);
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}

}
