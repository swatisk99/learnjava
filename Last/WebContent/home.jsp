<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="java.util.*, com.cruds.leads.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
<link rel="stylesheet"  href="css/style.css">
<script src="JS/jquery.js"></script>
<style>
	.updateLink{
		display:none;
	}
	.row::hover .updateLink{
		display: block;
	}
</style>
</head>
<body>
<% if(session.getAttribute("userName")==null){
	response.sendRedirect("login.jsp");
	}
	boolean isAdmin = session.getAttribute("isAdmin")==null? false:true;
	if(!isAdmin){
		out.print("<script>");
		out.println("alert('Reminder :  Update and Delete features are enabled for Admins ONLY!');");
		out.print("</script>");
	}
%>
<form action="search">
	<input type="search" required name="search" class="inputSubmit" placeholder="Search Lead Name"/>
	<input type="submit" value="Search" style="float: inherit" class="inputSubmit"/>
</form>
	<form action="logout" method="post" style="float:right">
		<input type="submit" value="Logout" >
	</form>
	<button id="createLeadBtn" style="float: left;">Add New Lead</button>
	
	<div id="createFormModal" style="display: none; position: absolute; z-index: 10; top: 50%; left: 50%; transform: translate(-50%, -50%); width: 300px; height: 350px; background-color: skyblue; border-radius: 20px;">
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
	
	<div id="updateFormModal" style="display: none; position: fixed; z-index: 10; top: 50%; left: 50%; transform: translate(-50%, -50%); width: 300px; height: 350px; background-color: skyblue; border-radius: 20px;">
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
	
	<form id="deleteForm" action="delete" method="post" >
		<c:if test="${isAdmin == 'true'}">
			<input type="submit" value="Delete" formaction="delete" style="float: inherit"/>
		</c:if>
		<c:if test="${isAdmin == 'false'}">
			<input type="submit" value="Delete" formaction="delete" style="float: inherit" disabled="disabled"/>
		</c:if>
	 <br><br>
	<table class="center">
		<thead>
		<tr bgcolor="#eaf5fa">
			<th autocapitalize="words" >Lead Name</th>
			<th >Email Address</th>
			<th>Company</th>
		</tr>
		</thead>
		<tbody id="records">
		
		</tbody>
	</table>
	</form>
	</form>
		<input id="page" name="page" type="hidden">
		<button id="btn" >...</button>
	
	<script>
		$(document).ready(function() {
			$('#page').val(1)
			$.ajax({
				url : 'display.jsp',
				type : 'GET',
				dataType : 'JSON',
				data:{
					page : 1	
				},
				success : function(response) {
					//alert('hi');
					//var res = JSON.parse(response);
					var print = "";
					for(var i=0;i<response.length;i++){
						print+="<tr><td>"+response[i].leadName+"</td><td>"+response[i].emailID+"</td><td>"+response[i].company+
						"</td><td><a href=\"#updateForm\" onclick=\"showUpdateForm()\" class=\"updateLink\" data-record-id="+response[i].leadID+">Update</a></td></tr>"+
						"</td><td><a href=\"#popup-form\" class=\"deleteLink\" data-record-id="+response[i].leadID+">Delete</a></td></tr>";
					}
					$("#records").html(print);
				},
			});
			$("#btn").click(function() {
				var nextPage = parseInt($("#page").val())+1;
				$('#page').val(nextPage);
				$.ajax({
					url : 'display.jsp',
					type : 'GET',
					dataType : 'JSON',
					data:{
						page : parseInt($("#page").val())
					},
					success : function(response) {
						var print = "";
						for(var i=0;i<response.length;i++){
							print+="<tr><td>"+response[i].leadName+"</td><td>"+response[i].emailID+"</td><td>"+response[i].company+"</td><td><input type=\"radio\" name=\"selectRecord\" value=\""+response[i].leadID+"\"</td></tr>";
						}
						$("#records").html(print);
					},
				});
			});
		});
	
		var createLeadBtn = document.getElementById('createLeadBtn');
		var createFormModal = document.getElementById('createFormModal');
		var closeModalBtn = document.getElementById('closeModalBtn');
		var closeUpdateFormBtn = document.getElementById('closeUpdateForm');
		createLeadBtn.addEventListener('click', function() {
			createFormModal.style.display = 'block';
			document.querySelectorAll('body >*:not(#createFormModal)').forEach(e => e.style.filter = "blur(2px)");

		});
	  
		function showUpdateForm(){
			var updateFormModal = document.getElementById('updateFormModal');
			updateFormModal.style.display = 'block';
			document.querySelectorAll('body >*:not(#updateForm)').forEach(e => e.style.filter = "blur(2px)");
			document.querySelectorAll('form >*:not(#updateFormModal)').forEach(e => e.style.filter = "blur(2px)");

		}
	
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