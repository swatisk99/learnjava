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
</head>
<body>
<% boolean isAdmin = session.getAttribute("isAdmin")==null? false:true;
%>
<script>
		$(document).ready(function() {
			$.ajax({
				url : 'search',
				type : 'GET',
				dataType : 'JSON',
				data:{
					search : $('#search').val()
				},
				success : function(response) {
					//alert('hi');
					//var res = JSON.parse(response);
					debugger;
					var print = "";
					for(var i=0;i<response.records.length;i++){
						print+="<tr><td>"+response.records[i].leadName+"</td><td>"+response.records[i].emailID+"</td><td>"+response.records[i].company+"</td><td><input type=\"radio\" name=\"selectRecord\" class=\"selectRecord\" value=\""+response.records[i].leadID+"\"</td></tr>";
					}
					$("#records").html(print);
				},
			});
			$("#updateBtn").click(function() {
				
				var updateFormModal = document.getElementById('updateFormModal');
				updateFormModal.style.display = 'block';
				document.querySelectorAll('body >*:not(#updateForm)').forEach(e => e.style.filter = "blur(2px)");
				document.querySelectorAll('form >*:not(#updateFormModal)').forEach(e => e.style.filter = "blur(2px)");
			/* 	closeUpdateFormBtn.addEventListener('click',function(){
					updateFormModal.style.display = 'none';
					document.querySelectorAll('body >*').forEach(e => e.style.filter = "blur(0px)")
					return false;
				}); */
				$.ajax({
					url : 'getInfo',
					type : 'GET',
					dataType : 'JSON',
					data:{
						selectRecord : $('input[name=selectRecord]:checked').val()
					},
					success : function(response) {
						$("#updatedLeadName").val(response.record.leadName);
						$("#updatedEmailID").val(response.record.emailID);
						$("#updatedCompany").val(response.record.company);
					},
				});
			});
			
			$("#closeUpdateForm").click(function() {
				updateFormModal.style.display = 'none';
				document.querySelectorAll('body >*').forEach(e => e.style.filter = "blur(0px)");
				return false;
			});
			
		});
</script>
<form action="search">
	<input type="search" required name="search" id="search" class="inputSubmit" placeholder="Search Lead Name"/>
	<input type="submit" value="Search" style="float: inherit" class="inputSubmit" id="searchBtn"/>
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
	<form  id="updateForm" action="getInfo">
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
			<th>Select Record</th>
		</tr>
		</thead>
		<tbody id="records">
		
		</tbody>
	</table>
	</form>
	</form>
	<input id="page" name="page" type="hidden">
	<input id="totalPages" name="totalPages" type="hidden">
	
	<button id="prevBtn" style="float: inherit;">&lt;&lt;</button>
	<button id="nextBtn" style="float: inherit;">>></button>
	<script>
		var createLeadBtn = document.getElementById('createLeadBtn');
		var createFormModal = document.getElementById('createFormModal');
		var closeModalBtn = document.getElementById('closeModalBtn');
		createLeadBtn.addEventListener('click', function() {
			createFormModal.style.display = 'block';
			document.querySelectorAll('body >*:not(#createFormModal)').forEach(e => e.style.filter = "blur(2px)");

		});
	  
		
	
		closeModalBtn.addEventListener('click',function(){
			createFormModal.style.display = 'none';	
			document.querySelectorAll('body >*').forEach(e => e.style.filter = "blur(0px)")
		});
		
				
	</script>
</body>
</html>