<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Page</title>
<jsp:include page="components/styles.jsp" />
</head>
<body>
	<jsp:include page="components/header.jsp" />

	<main>
	<div class="container">
		<div class="row">
			<div class="row"></div>
			<form class="col s12" id="reg-form" method="POST"
				action="${contextPath}/registration" novalidate="novalidate">
				<div class="center-align red-text text-darken-1">${error}</div>
				<div class="row">
					<div
						class="input-field col s12 m8 l6 offset-s0 offset-m2 offset-l3">
						<i class="material-icons prefix">account_circle</i> <label
							for="rlogin" class="">Login</label> <input id="rlogin"
							name="rlogin" type="text" data-error=".errorTxt1">
						<div class="errorTxt1 center-align red-text text-darken-1"></div>
					</div>
				</div>
				<div class="row">
					<div
						class="input-field col s12 m8 l6 offset-s0 offset-m2 offset-l3">
						<i class="material-icons prefix">lock_open</i> <label
							for="rpassword">Password</label> <input id="rpassword"
							type="password" name="rpassword" data-error=".errorTxt2">
						<div class="errorTxt2 center-align red-text text-darken-1"></div>
					</div>
				</div>
				<div class="row">
					<div
						class="input-field col s12 m8 l6 offset-s0 offset-m2 offset-l3">
						<i class="material-icons prefix">lock</i> <label for="cpassword">Confirm
							password</label> <input id="cpassword" type="password" name="cpassword"
							data-error=".errorTxt3">
						<div class="errorTxt3 center-align red-text text-darken-1"></div>
					</div>
				</div>
				<div class="row center-align">
					<div class="input-field col s12">
						<button class="btn waves-effect waves-light" type="submit"
							name="action">
							Register <i class="material-icons right">send</i>
						</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	</main>

	<jsp:include page="components/footer.jsp" />
</body>
</html>