//$Id$
package com.cruds.leads;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

public class GetLeadInfoAction extends ActionSupport {
		public String execute() throws IOException, SQLException {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpServletResponse response = ServletActionContext.getResponse();
			int selectRecord = Integer.parseInt(request.getParameter("selectRecord"));
			Map<String,Object>  record = new HashMap<>();
			record.put("record", LeadDBUtil.getLeadInfo(selectRecord));
			String json = new Gson().toJson(record);
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(json);
			return null;
			
		}
}
