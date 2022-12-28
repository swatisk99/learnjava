//$Id$
package com.cruds.leads;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class CreateLeadAction extends ActionSupport {
    HttpServletRequest request = ServletActionContext.getRequest();
	String leadName = request.getParameter("leadName");
	String emailID = request.getParameter("emailID");
	String company = request.getParameter("company");
	
	public String execute() {
		if(LeadDBUtil.createLead(new LeadInfo(leadName,emailID,company))) {
			return SUCCESS;
		}	
		return INPUT;
	}
}
