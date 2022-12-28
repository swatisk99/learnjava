package com.cruds.login;

import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class LogoutAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	public String execute(){
		SessionMap session = (SessionMap) ActionContext.getContext().getSession();
		//invalidate
		session.invalidate();
		session.remove("userName");
		return SUCCESS;
	}

}
