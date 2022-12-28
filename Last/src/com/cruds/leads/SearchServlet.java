//$Id$
package com.cruds.leads;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		List<LeadInfo> matchingList = LeadDBUtil.searchLeads(request.getParameter("search"));
		request.setAttribute("matchingList",matchingList);
		request.getRequestDispatcher("search.jsp").forward(request, response);;
	}

}
