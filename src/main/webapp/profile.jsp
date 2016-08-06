<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Authentication Successful</title>
<jsp:include page="components/styles.jsp" />
</head>
<body>
	<jsp:include page="components/header.jsp" />
	
	<main>
	<div class="container">
		<div class="row">
			
			<h1 class="center-align">Welcome, ${user.login}!</h1>
		</div>
	</div>
	</main>
	
	<jsp:include page="components/footer.jsp" />
</body>
</html>