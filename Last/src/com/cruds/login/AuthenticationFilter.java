//$Id$
package com.cruds.login;
import java.io.IOException;

import javax.servlet.*;

import com.opensymphony.xwork2.ActionContext;
public class AuthenticationFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if(UserDBUtil.authenticateUser(userName, password)) {
			if(UserDBUtil.authorizeUser(userName, password)) {
				ActionContext.getContext().getSession().put("isAdmin", "true");
			}
			chain.doFilter(request,response);
		}
	}

}
