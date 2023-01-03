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
<link rel="fav icon" href="favicon.png" />
</head>
<body>
<% boolean isAdmin = session.getAttribute("isAdmin")==null? false:true;
%>
<script>
		$(document).ready(function() {
			$('#page').val(1)
			$.ajax({
				url : 'display',
				type : 'GET',
				dataType : 'JSON',
				data:{
					page : 1	
				},
				success : function(response) {
					//alert('hi');
					//var res = JSON.parse(response);
					debugger;
					var print = "";
					for(var i=0;i<response.data.length;i++){
						if(i==0){
							print+="<tr><td>"+response.data[i].leadName+"</td><td>"+response.data[i].emailID+"</td><td>"+response.data[i].company+"</td><td><input type=\"radio\" name=\"selectRecord\" class=\"selectRecord\" value=\""+response.data[i].leadID+"\" checked=\"checked\"</td></tr>";
						}
						else{
							print+="<tr><td>"+response.data[i].leadName+"</td><td>"+response.data[i].emailID+"</td><td>"+response.data[i].company+"</td><td><input type=\"radio\" name=\"selectRecord\" class=\"selectRecord\" value=\""+response.data[i].leadID+"\"</td></tr>";
						}
					}
					$('#totalPages').val(response.totalPages);
					$("#records").html(print);
				},
			});
			$("#nextBtn").click(function() {
				if($('#page').val() == parseInt($('#totalPages').val())){
					$('#nextBtn').css('cursor', 'not-allowed');
					var nextPage = $('#page').val();
				}
				else{
					var nextPage = parseInt($("#page").val())+1;
					$('#page').val(nextPage);
					$.ajax({
						url : 'display',
						type : 'GET',
						dataType : 'JSON',
						data:{
							page : parseInt($("#page").val())
						},
						success : function(response) {
							debugger;
							var print = "";
							for(var i=0;i<response.data.length;i++){
								if(i==0){
									print+="<tr><td>"+response.data[i].leadName+"</td><td>"+response.data[i].emailID+"</td><td>"+response.data[i].company+"</td><td><input type=\"radio\" name=\"selectRecord\" class=\"selectRecord\" value=\""+response.data[i].leadID+"\" checked=\"checked\"</td></tr>";
								}
								else{
									print+="<tr><td>"+response.data[i].leadName+"</td><td>"+response.data[i].emailID+"</td><td>"+response.data[i].company+"</td><td><input type=\"radio\" name=\"selectRecord\" class=\"selectRecord\" value=\""+response.data[i].leadID+"\"</td></tr>";
								}
							}
							$("#records").html(print);
						},
					});
				}
				
			});
			$("#prevBtn").click(function() {
				if($('#page').val() == 1){
					$('#prevBtn').css('cursor', 'not-allowed');
					var prevPage = 1;
				}
				else{
					var prevPage = parseInt($("#page").val())-1;
					$('#page').val(prevPage);
					$.ajax({
						url : 'display',
						type : 'GET',
						dataType : 'JSON',
						data:{
							page : parseInt($("#page").val())
						},
						success : function(response) {
							debugger;
							var print = "";
							for(var i=0;i<response.data.length;i++){
								if(i==0){
									print+="<tr><td>"+response.data[i].leadName+"</td><td>"+response.data[i].emailID+"</td><td>"+response.data[i].company+"</td><td><input type=\"radio\" name=\"selectRecord\" class=\"selectRecord\" value=\""+response.data[i].leadID+"\" checked=\"checked\"</td></tr>";
								}
								else{
									print+="<tr><td>"+response.data[i].leadName+"</td><td>"+response.data[i].emailID+"</td><td>"+response.data[i].company+"</td><td><input type=\"radio\" name=\"selectRecord\" class=\"selectRecord\" value=\""+response.data[i].leadID+"\"</td></tr>";
								}
							}
							$("#records").html(print);
						},
					});
				}
			});
			$("#searchBtn").click(function(){
				event.preventDefault();
				$('#records').css({
					'overflow-y': 'scroll',
					'max-height': '100px'
				});
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
			});
			$("#updateBtn").click(function() {
				$('#updateFormModal').show();
				var blurredElements = $('body >*:not(#updateForm)');
				  blurredElements.css('filter', 'blur(2px)');
				  blurredElements = $('form >*:not(#updateFormModal)');
				  blurredElements.css('filter', 'blur(2px)');
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
				$('#updateFormModal').hide();
				blurredElements.css('filter', 'blur(0px)');
				return false;
			});
			
		});
</script>
<form action="search">
	<input type="search" required name="search" id="search" class="inputSubmit" placeholder="Search Lead Name"/>
	<input type="button" value="Search" style="float: inherit" class="inputSubmit" id="searchBtn"/>
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
	<form  id="updateForm" action="update">
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
				<input type="submit" value="Submit">
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
		
		<tbody id="records" style="overflow-y:hidden;">
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