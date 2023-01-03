<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet"  href="css/style.css">
<link rel="fav icon" href="favicon.png" />

<style>
	li{
		display: inline;
		padding-bottom:16px;
		padding-top:10px; 
		padding-right:40px;
		padding-left:40px;
		cursor:pointer;
	 }
	li:active{
		background-color: #c1e2f1;
		border-top-color: green;
		border-top-style: solid;
	}
</style>
</head>
<body>

	<%
		if(session.getAttribute("loginAttempted")!=null){
			out.print("<script>");
			out.println("alert('User or password incorrect');");
			out.print("</script>");
			session.invalidate();
		}
		else if(session.getAttribute("signupAttempted")!=null){
			out.print("<script>");
			out.println("alert('User already exists!');");
			out.print("</script>");
			session.invalidate();
		}
	
	%>
	<div class="modal" style="position: absolute; top: 50%; left: 50%; transform: translate(-50%, -50%); background-color: skyblue; border-radius: 10px; border-style:solid; border-color: black;">
		<ul style="list-style-type: none;">
			<li style="background-color: #c1e2f1;" id="loginBtn">Login   
			<li style="background-color: skyblue;" id="signupBtn">SignUp		
		</ul>
		<div id="loginTab" style="display:block; background-color: #c1e2f1; padding:20px; ">
				<s:form action="login" style="margin: auto;" method="post">
					<h3>Login Form</h3>
					<s:textfield type="text" id="userName" name="userName" pattern="[a-zA-Z0-9_]{2,}"  required="true" label="User Name"/><br>
					<s:textfield type="password" id="password" name="password" required="true" label="Password"/><br><br>
					<s:submit value="Login"/>
				</s:form>
		</div>
		<div id="signupTab" style="display: none; padding:20px;">
			<s:form action="signup"  method="Post">
				<h3>New User Details</h3>
				<s:textfield type="text" id="userName" name="userName" pattern="[a-zA-Z0-9_]{2,}" placeholder="Atleast 2 characters(letters,numbers,_)" required="true" label="Set Username"/><br>
				<s:textfield type="email" id="email" name="email" placeholder="a@b.cd" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" required="true" label="Email"/><br>
				<s:textfield type="password" id="password" name="password" pattern=".{8,}" placeholder="Minimum 8 characters" required="true" label="Set Password"/><br><br>
				<s:submit value="Submit"/>
			</s:form>
		</div>
	</div>
	<script>
		var signupBtn = document.getElementById('signupBtn');
		var loginBtn = document.getElementById('loginBtn');
		var Modal = document.getElementById('modal');
		var signupTab = document.getElementById('signupTab');
		var loginTab = document.getElementById('loginTab');
		
		signupBtn.addEventListener('click', function() {
			signupTab.style.display = 'block';
			loginBtn.style.backgroundColor = 'skyblue';
			loginTab.style.backgroundColor = 'skyblue';
			signupBtn.style.backgroundColor = '#c1e2f1';
			signupTab.style.backgroundColor = '#c1e2f1';
			loginTab.style.display='none';
			
		});
		
		loginBtn.addEventListener('click',function(){
			signupTab.style.display = 'none';
			loginTab.style.display='block';
			loginBtn.style.backgroundColor = '#c1e2f1';
			loginTab.style.backgroundColor = '#c1e2f1';
			signupBtn.style.backgroundColor = 'skyblue';
			signupTab.style.backgroundColor = 'skyblue';
		});
	</script></body>
</html>