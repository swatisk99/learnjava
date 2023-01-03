//$Id$
package com.cruds.leads;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport {
	public String execute() throws IOException, SQLException {
		HttpServletRequest request = ServletActionContext.getRequest();
		if(request.getSession().getAttribute("isAdmin")==null)
		{	
			return ERROR;
		}
		String leadName = request.getParameter("leadName");
		String emailID = request.getParameter("emailID");
		String company = request.getParameter("company");
		String updatedLeadName = request.getParameter("updatedLeadName");
		String updatedEmailID = request.getParameter("updatedEmailID");
		String updatedCompany = request.getParameter("updatedCompany");
		int id = Integer.parseInt(request.getParameter("selectRecord"));
		if(LeadDBUtil.updateLead(id, LeadDBUtil.getLeadInfo(id), new LeadInfo(updatedLeadName,updatedEmailID,updatedCompany))) {
			request.getSession().setAttribute("rowUpdated", "true");
			return SUCCESS;
		}
		return null;
	}
}
