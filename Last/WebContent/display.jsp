<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="java.util.*, com.cruds.leads.*, com.google.gson.Gson" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<%
int pageNo;
if(request.getParameter("page")==null) {
	pageNo=1;
}
else {
	pageNo = Integer.parseInt(request.getParameter("page"));
}
List<Map<String, String>> leadList = LeadDBUtil.showLeads(pageNo);
String json = new Gson().toJson(leadList);
response.setContentType("application/json");
response.setCharacterEncoding("UTF-8");
response.getWriter().write(json);
%>
</body>
</html>