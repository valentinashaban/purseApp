<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%!String contextPath;%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<jsp:include page="components/styles.html" />
</head>
<body>
	<div class="container">
		<div class="row">

			<jsp:include page="components/header.jsp" />

			<div class="row"></div>

			<form action="${contextPath}/login" method="POST"
				class="login-form col s12">
				<div class="row">
					<div
						class="input-field col s12 m8 l6 offset-s0 offset-m2 offset-l3">
						<i class="material-icons prefix">account_circle</i> <input
							id="login-form-login" type="text" name="login" class="validate">
						<label for="login-form-login">Login</label>
					</div>
				</div>
				<div class="row">
					<div
						class="input-field col s12 m8 l6 offset-s0 offset-m2 offset-l3">
						<i class="material-icons prefix">lock_open</i> <input
							id="login-form-password" type="password" name="password"
							class="validate"> <label for="login-form-password">Password</label>

					</div>
				</div>
				<div class="row center-align">
					<button class="btn waves-effect waves-light" type="submit"
						name="action">
						Submit <i class="material-icons right">send</i>
					</button>
				</div>
			</form>
		</div>
	</div>

	<jsp:include page="components/scripts.jsp" />
</body>
</html>