<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>

<div style="text-align: center;">
		<h1 style="font-size: 100px;">SRI MAHALAKSHMI INDUSTRIES</h1>
	</div>
	<form action="Login" method="post">
		<div style="text-align:center" class="container">
			<label for="uname"><b>UserName: </b></label><input type="text"
				placeholder="Enter Username" name="userId" required><br><br><label
				for="psw"><b>Password: </b></label><input type="password"
				placeholder="Enter Password" name="psw" required></div>
		<!--  <button type="submit">Login</button><label> <input type="checkbox" checked="checked"name="remember"> Remember me</label>-->	
		<div>
			<br><input type="submit" value="Login"
			style='width: 100px; margin: 0 50%; position: relative; left: -50px;' />
		</div>
</form>
</body>
</html>