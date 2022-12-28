//$Id$
package com.cruds.leads;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String leadName = request.getParameter("leadName");
		String emailID = request.getParameter("emailID");
		String company = request.getParameter("company");
		String updatedLeadName = request.getParameter("updatedLeadName");
		String updatedEmailID = request.getParameter("updatedEmailID");
		String updatedCompany = request.getParameter("updatedCompany");
		int id = Integer.parseInt(request.getParameter("selectRecord"));
		if(LeadDBUtil.updateLead(id, LeadDBUtil.getLeadInfo(id), new LeadInfo(updatedLeadName,updatedEmailID,updatedCompany))) {
			request.getSession().setAttribute("rowUpdated", "true");
			response.sendRedirect(request.getContextPath()+"/home.jsp");
		}
		
	}
}
