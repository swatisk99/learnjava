//$Id$
package com.cruds.leads;

import java.io.IOException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport {
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response = ServletActionContext.getResponse();
	public String execute() throws IOException{
		String search = request.getParameter("search");
		Map<String,Object> records = new HashMap<>();
		records.put("records", LeadDBUtil.searchLeads(search));
		String json = new Gson().toJson(records);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);
		return null;
	}

}
