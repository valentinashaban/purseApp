<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Authentication Successful</title>
<jsp:include page="components/styles.html" />
</head>
<body>
	<div class="container">
		<div class="row">
			<jsp:include page="components/header.jsp" />
			<h1 class="center-align">Welcome, ${user.login}!</h1>
		</div>
	</div>
	<jsp:include page="components/scripts.jsp" />
</body>
</html>