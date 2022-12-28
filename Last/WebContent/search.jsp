<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="java.util.*, com.cruds.leads.*" %>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
<link rel="stylesheet"  href="css/style.css">
</head>
<body>
<% if(session.getAttribute("userName")==null){
		response.sendRedirect("login.jsp");
	}
	boolean isAdmin = session.getAttribute("isAdmin")==null? false:true;
%>
	<form action="search">
		<input type="search" required name="search" class="inputSubmit" placeholder="Search Lead Name"/>
		<input type="submit" value="Search" style="float: inherit" class="inputSubmit"/>
	</form>
	<form action="logout" style="float:right">
		<input type="submit" value="Logout">
	</form>
	<form action="home.jsp" style="float:inherit;">
		<input type="submit" value="Home" />
	</form>
	<button id="createLeadBtn" style="float: left;">Add New Lead</button>
	
	<div id="createFormModal" style="display: none; position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%); width: 300px; height: 350px; background-color: skyblue; border-radius: 20px;">
		<div style="padding: 20px;">
			<button id="closeModalBtn" style="float:right">&times</button>
			<h3 >New Lead Details</h3>
				<form action="create" method="Post">
					<label for="leadName">Lead Name	</label><br>
					<input type="text" id="leadName" name="leadName" required pattern="[a-zA-Z ]{2,}"><br>
					<label for="emailID">Email	</label><br>
					<input type="email" id="emailID" name="emailID" required placeholder="a@b.cd" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"><br>
					<label for="company">Company	</label><br>
					<input type="text" id="company" name="company" required><br><br>
					<input type="submit" value="Submit">
				</form>
	   	 </div>
	</div>
	
	<form  id="updateForm" action="update" method="post">
	<c:if test="${isAdmin == 'true'}">
		<input type="button" id="updateBtn" style="float: right;" value="Update"/>
	</c:if>
	<c:if test="${isAdmin == 'false'}">
		<input type="button" id="updateBtn" style="float: right;" value="Update" disabled="disabled"/>
	</c:if>	
	<div id="updateFormModal" style="display: none; position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%); width: 300px; height: 350px; background-color: skyblue; border-radius: 20px;">
 		<div style="padding: 20px;">
 			<button id="closeUpdateForm" style="float:right">&times</button>
	 		<h3 >Update Lead Details</h3>
				<label for="updatedLeadName">Lead Name	</label><br>
				<input type="text" id="updatedLeadName" name="updatedLeadName" pattern="[a-zA-Z ]{2,}"><br>
				<label for="updatedEmailID">Email	</label><br>
				<input type="email" id="updatedEmailID" name="updatedEmailID" placeholder="a@b.cd" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"><br>
				<label for="updatedCompany">Company	</label><br>
				<input type="text" id="updatedCompany" name="updatedCompany"><br><br>
				<input type="submit" value="Submit" formaction="update">
    	 </div>
	</div>
	
	<form action="delete" method="post"> 
		<c:if test="${isAdmin == 'true'}">
			<input type="submit" value="Delete" formaction="delete" style="float: inherit"/>
		</c:if>
		<c:if test="${isAdmin == 'false'}">
			<input type="submit" value="Delete" formaction="delete" style="float: inherit" disabled="disabled"/>
		</c:if>	<%	List<LeadInfo> matchingLeads = (List<LeadInfo>) request.getAttribute("matchingList");	
		if(matchingLeads == null){
			out.print("<script>");
			out.print("windows.alert(\"No matching leads found!!\");");
			out.print("</script>");
		} 
		else{	
			pageContext.setAttribute("matchingLeads",matchingLeads);
		%>	
			<table>
				<thead>
					<tr bgcolor="#eaf5fa">
						<th autocapitalize="words" >Lead Name</th>
						<th >Email Address</th>
						<th>Company</th>
						<th>Select Record</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items = "${matchingLeads}" var="lead" varStatus="status">
					
					<tr>
						<td>${lead.leadName}</td>
						<td>${lead.emailID}</td>
						<td>${lead.company}</td>
						<c:if test="${matchingLeads.indexOf(lead)==0}">
							<td><input type="radio" value="${lead.getLeadID()}" name="selectRecord" checked="checked"></td>
						</c:if>
						<c:if test="${matchingLeads.indexOf(lead)!=0}">
							<td><input type="radio" value="${lead.getLeadID()}" name="selectRecord"></td>
						</c:if>
					</tr>
					
				</c:forEach>
				
				</tbody>
	</table>
	<%} %>
	</form>
	</form>

	<script>
		createLeadBtn.addEventListener('click', function() {
			document.querySelectorAll('body >*:not(#createFormModal)').forEach(e => e.style.filter = "blur(2px)");
			createFormModal.style.display = 'block';
		});
	  
		updateBtn.addEventListener('click',function(){
			updateFormModal.style.display = 'block';
			document.querySelectorAll('body >*:not(#updateForm)').forEach(e => e.style.filter = "blur(2px)");
			document.querySelectorAll('form >*:not(#updateFormModal)').forEach(e => e.style.filter = "blur(2px)");

		});
	
		closeModalBtn.addEventListener('click',function(){
			createFormModal.style.display = 'none';	
			document.querySelectorAll('body >*').forEach(e => e.style.filter = "blur(0px)")
		});
		
		closeUpdateFormBtn.addEventListener('click',function(){
			updateFormModal.style.display = 'none';
			document.querySelectorAll('body >*').forEach(e => e.style.filter = "blur(0px)")
	
		});
	</script>
</body>
</html>








