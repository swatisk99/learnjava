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
%>

<form action="search">
	<input type="search" name="search" class="inputSubmit" placeholder="Search"/>
	<input type="submit" value="Search" style="float: inherit" class="inputSubmit"/>
</form>
	<form action="logout" method="post">
		<input type="submit" value="Logout" style="float:right">
	</form>
	<button id="createLeadBtn" style="float: inherit;">Add New Lead</button>
	
	<div id="createFormModal" style="display: none; position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%); width: 300px; height: 350px; background-color: pink; border-radius: 20px;">
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

	<form action="update" method="post">
	<input type="button" id="updateBtn" style="float: right;" value="Update"/>
		<div id="updateFormModal" style="display: none; position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%); width: 300px; height: 350px; background-color: pink; border-radius: 20px;">
	 		<div style="padding: 20px;">
				<h3 >Update Lead Details</h3>
	 			<button id="closeUpdateForm" style="float:right">&times</button>
	 				<br><br><br>
					<label for="updatedLeadName">Lead Name	</label><br>
					<input type="text" id="updatedLeadName" name="updatedLeadName" pattern="[a-zA-Z ]{2,}"><br>
					<label for="updatedEmailID">Email	</label><br>
					<input type="email" id="updatedEmailID" name="updatedEmailID" placeholder="a@b.cd" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"><br>
					<label for="updatedCompany">Company	</label><br>
					<input type="text" id="updatedCompany" name="updatedCompany"><br><br>
					<input type="submit" value="Submit" formaction="update">
	    	 </div>
		</div>
	
	<form action="delete" method="post" >
	 <input type="submit" value="Delete" formaction="delete" style="float: inherit" />
	 <br><br>
	 
	<table class="center">
		<tr bgcolor="#eaf5fa">
			<th autocapitalize="words" >Lead Name</th>
			<th >Email Address</th>
			<th>Company</th>
			<th>Select Record</th>
		</tr>
		<%	List<LeadInfo> leadList = LeadDBUtil.showLeads(1);	
			pageContext.setAttribute("leadList",leadList);
		%>	
		
		<c:forEach var="lead" items = "${leadList}" >
			<tr>
				<td>${lead.leadName}</td>
				<td>${lead.emailID}</td>
				<td>${lead.company}</td>
				<c:if test="${leadList.indexOf(lead)==0}">
					<td><input type="radio" value="${lead.getLeadID()}" name="selectRecord" checked="checked"></td>
				</c:if>
				<c:if test="${leadList.indexOf(lead)!=0}">
					<td><input type="radio" value="${lead.getLeadID()}" name="selectRecord"></td>
				</c:if>
			</tr>
		</c:forEach>
	</table>
	</form>
	</form>

	<script>
		var createLeadBtn = document.getElementById('createLeadBtn');
		var createFormModal = document.getElementById('createFormModal');
		var updateBtn = document.getElementById("updateBtn");
		var updateFormModal = document.getElementById('updateFormModal');
		var closeModalBtn = document.getElementById('closeModalBtn');
		var closeUpdateFormBtn = document.getElementById('closeUpdateFormBtn');
		createLeadBtn.addEventListener('click', function() {
			createFormModal.style.display = 'block';
		});
	  
		updateBtn.addEventListener('click',function(){
			updateFormModal.style.display = 'block';
		});
	
		closeModalBtn.addEventListener('click',function(){
			createFormModal.style.display = 'none';	
		});
		
		closeUpdateFormBtn.addEventListener('click',function(){
			updateFormModal.style.display = 'none';	
		});
		
	</script>
</body>
</html>