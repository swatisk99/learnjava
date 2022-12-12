//$Id$
package com.cruds.leads;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String leadName = request.getParameter("leadName");
		String emailID = request.getParameter("emailID");
		String company = request.getParameter("company");
		System.out.println(request.getContextPath());
		if(LeadDBUtil.createLead(new LeadInfo(leadName,emailID,company))) {
			response.sendRedirect(request.getContextPath()+"/home.jsp");
		}	
	}
}
