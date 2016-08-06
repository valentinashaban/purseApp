<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:useBean id="now" class="java.util.Date" />
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<footer class="page-footer">
	<div class="container">
		<div class="row">
			<div class="col l6 s12">
				<h5 class="white-text">Lorem Ipsum</h5>
				<p class="grey-text text-lighten-4">Lorem ipsum dolor sit amet,
					consectetur adipiscing elit. Duis sed neque et urna vehicula
					fermentum sit amet vitae mi. In tempus nunc et ultricies congue.
					Fusce sed hendrerit ligula. Praesent id nibh finibus, interdum sem
					dignissim, pharetra neque. Praesent ligula ligula, fermentum vel
					nibh non, accumsan blandit diam.</p>
			</div>
			<div class="col l4 offset-l2 s12">
				<h5 class="white-text">Profile Links</h5>
				<c:choose>
					<c:when test="${user != null}">
						<ul>
							<li><a class="grey-text text-lighten-3"
								href="${contextPath}/profile">${user.login}</a></li>
							<li><a class="grey-text text-lighten-3"
								href="${contextPath}/logout">Log Out</a></li>
						</ul>
					</c:when>
					<c:otherwise>
						<ul>
							<li><a class="grey-text text-lighten-3"
								href="${contextPath}/login">Log In</a></li>
							<li><a class="grey-text text-lighten-3"
								href="${contextPath}/registration">Sign Up</a></li>
						</ul>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>
	<div class="footer-copyright">
		<div class="container">
			<fmt:formatDate var="year" value="${now}" pattern="yyyy" />
			&copy; ${year} Valentina Copyright
		</div>
	</div>
</footer>
<jsp:include page="scripts.jsp" />