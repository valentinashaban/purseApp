<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<header class="page-header">
	<nav>
		<div class="container">
			<div class="nav-wrapper">
				<div class="col s12">
					<a href="${contextPath}/" class="brand-logo"><i
						class="medium material-icons">work</i>Home page</a> <a href="#"
						data-activates="mobile-demo" class="button-collapse"><i
						class="material-icons">menu</i></a>

					<c:choose>
						<c:when test="${user != null}">
							<ul id="nav-mobile" class="right hide-on-med-and-down">
								<li><a href="${contextPath}/profile">${user.login}</a></li>
								<li><a href="${contextPath}/logout">Log Out</a></li>
							</ul>
							<ul class="side-nav" id="mobile-demo">
								<li><a href="${contextPath}/profile">${user.login}</a></li>
								<li><a href="${contextPath}/logout">Log Out</a></li>
							</ul>
						</c:when>
						<c:otherwise>
							<ul id="nav-mobile" class="right hide-on-med-and-down">
								<li><a href="${contextPath}/login">Log In</a></li>
								<li><a href="${contextPath}/registration">Sign Up</a></li>
							</ul>
							<ul class="side-nav" id="mobile-demo">
								<li><a href="${contextPath}/login">Log In</a></li>
								<li><a href="${contextPath}/registration">Sign Up</a></li>
							</ul>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div>
	</nav>
</header>