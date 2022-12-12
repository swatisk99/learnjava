<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="java.util.*, com.cruds.login.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<%
		if(session.getAttribute("loginAttempted")!=null){
			out.print("<script>");
			out.println("alert('User or password incorrect');");
			out.print("</script>");
		}
	%>
	<form action="login" style="margin: auto;" method="post">
		<h3>Login Form</h3>
		<label for="userName">User Name	</label><br>
		<input type="text" id="userName" name="userName" pattern="[a-zA-Z0-9_]{2,}"><br>
		<label for="password">Password	</label><br>
		<input type="password" id="password" name="password"><br><br>
		<input type="submit" value="login">
	</form>
	
	<button id="signupBtn" style="float: inherit;">New User? Sign Up</button>	
	<div id="signupFormModal" style="display: none; position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%); width: 300px; height: 300px; background-color: lavender; border-radius: 20px;">
		<div style="padding: 20px;">
			<h3 style="float :left">New User Details</h3>
			<button id="closeModalBtn" style="float:right">&times</button><br><br>
				<form action="signup" method="Post">
					<label for="userName">User Name	</label><br>
					<input type="text" id="userName" name="userName" required pattern="[a-zA-Z0-9_]{2,}" placeholder="Atleast 2 characters(letters,numbers,_)"><br>
					<label for="email">Email	</label><br>
					<input type="email" id="email" name="email" required placeholder="a@b.cd" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"><br>
					<label for="password">Set Password</label><br>
					<input type="password" id="password" name="password" required><br><br>
					<input type="submit" value="Submit">
				</form>
	   	 </div>
	</div>
	<script>
		var signupBtn = document.getElementById('signupBtn');
		var signupFormModal = document.getElementById('signupFormModal');
		var closeModalBtn = document.getElementById('closeModalBtn');
		signupBtn.addEventListener('click', function() {
			signupFormModal.style.display = 'block';
		});
	  
		closeModalBtn.addEventListener('click',function(){
			signupFormModal.style.display = 'none';	
		});
		
	</script></body>
</html>