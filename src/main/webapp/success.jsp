<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.usm.model.User"%>

<%! User user = null; %>
<%
	user = (User) session.getAttribute("user");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Authentication Successful</title>
</head>
<body>
	<h1>
		Welcome <%= user.getLogin() %>!
	</h1>
</body>
</html>