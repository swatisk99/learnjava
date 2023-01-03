//$Id$
package com.cruds.leads;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;


public class DeleteAction extends ActionSupport {
	HttpServletRequest request = ServletActionContext.getRequest();
	public String execute(){
		if(request.getSession().getAttribute("isAdmin")==null)
		{	
			return ERROR;
		}
		int id = Integer.parseInt(request.getParameter("selectRecord"));
		if(LeadDBUtil.deleteLead(id)) {
			return SUCCESS;
		}
		return ERROR;
	}

}
