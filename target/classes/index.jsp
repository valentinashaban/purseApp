<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<form action="UserServlet" method="POST" class="login-form">
		<label>Login: <input id="login" type="text" name="login"
			placeholder="Enter your login here" /></label>
			
		<br>
		<br>
		<label>Password: <input
			id="password" type="password" name="password"
			placeholder="Enter your password here" /></label>
		
		<br>
		<button type="submit">Log In</button>
	</form>
</body>
</html>