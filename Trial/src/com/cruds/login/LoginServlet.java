package com.cruds.login;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if(UserDBUtil.authenticateUser(userName, password)) {
			
			HttpSession session = request.getSession();
			session.setAttribute("userName",userName);
			response.sendRedirect(request.getContextPath()+"/home.jsp");
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("loginAttempted","true");
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
