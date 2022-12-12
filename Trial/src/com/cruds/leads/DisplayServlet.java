//$Id$
package com.cruds.leads;

import java.io.IOException;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.annotation.WebServlet;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int page = Integer.parseInt(request.getParameter("page"));
		List<LeadInfo> leadList = LeadDBUtil.showLeads(page);
		System.out.println("LEAD LIST  : "+leadList);
		request.setAttribute("LEAD_LIST", leadList);
		RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
		rd.forward(request, response);
	}
}
