<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
<jsp:include page="components/styles.html" />
</head>
<body>
	<div class="container">
		<div class="row">

			<jsp:include page="components/header.jsp" />

			<div class="row"></div>

			<form class="col s12" id="login-form" method="POST"
				action="${contextPath}/login" novalidate="novalidate">
				<div class="center-align red-text text-darken-1">${error}</div>
				<div class="row">
					<div
						class="input-field col s12 m8 l6 offset-s0 offset-m2 offset-l3">
						<i class="material-icons prefix">account_circle</i> <label
							for="ulogin" class="">Login</label> <input id="ulogin"
							name="ulogin" type="text" data-error=".errorTxt1">
						<div class="errorTxt1 center-align red-text text-darken-1"></div>
					</div>
				</div>
				<div class="row">
					<div
						class="input-field col s12 m8 l6 offset-s0 offset-m2 offset-l3">
						<i class="material-icons prefix">lock_open</i> <label
							for="upassword">Password</label> <input id="upassword"
							type="password" name="upassword" data-error=".errorTxt2">
						<div class="errorTxt2 center-align red-text text-darken-1"></div>
					</div>
				</div>
				<div class="row center-align">
					<div class="input-field col s12">
						<button class="btn waves-effect waves-light" type="submit"
							name="action">
							Submit <i class="material-icons right">send</i>
						</button>
						<a href="${contextPath}/registration">&nbsp;Sign Up</a>
					</div>
				</div>
			</form>
		</div>
	</div>

	<jsp:include page="components/scripts.jsp" />
</body>
</html>