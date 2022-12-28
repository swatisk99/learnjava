//$Id$
package com.cruds.leads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport; 


public class DisplayAction extends ActionSupport {
	public String execute() throws IOException {
		int page;
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		if(request.getParameter("page")==null) {
			page=1;
		}
		else {
			page = Integer.parseInt(request.getParameter("page"));
		}
		List<Map<String, String>> leadList = LeadDBUtil.showLeads(page);
		String json = new Gson().toJson(leadList);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);	
		return SUCCESS;
	}
}
