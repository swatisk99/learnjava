//$Id$
package com.cruds.leads;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport; 


public class DisplayAction extends ActionSupport {
	public String execute() throws IOException, SQLException {
		int page;
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		if(request.getParameter("page")==null) {
			page=1;
		}
		else {
			page = Integer.parseInt(request.getParameter("page")) <1 ? 1 : Integer.parseInt(request.getParameter("page"));
		}
		try(Connection con = DBUtil.getConnection()){
				ResultSet result = con.prepareStatement("select count(lead_id) from leads;").executeQuery();
				int totalPages = 1;
				while(result.next()) {
					//to display 5 records per page, total number of pages is required
					totalPages = result.getInt(1)/5 +1;
					if(page > totalPages) {
						page = totalPages;
					}
			}
			//returns an array of key value pairs of leads.
			List<Map<String, String>> leadList = LeadDBUtil.showLeads(page);
			Map<String,Object> res = new HashMap<>();
			res.put("data", leadList);
			res.put("totalPages", (Integer)totalPages);
			String json = new Gson().toJson(res);
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(json);
		}
		return null;
	}
}
