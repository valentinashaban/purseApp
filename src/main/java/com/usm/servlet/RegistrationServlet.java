package com.usm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.usm.config.Factory;
import com.usm.model.User;
import com.usm.service.UserService;

@WebServlet(name = "RegistrationServlet", urlPatterns = "/registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationServlet() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserService.loadPage(request, response, "registration.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("rlogin");
		String password = request.getParameter("rpassword");

		String page = "registration.jsp";

		Factory factory = Factory.getInstance();

		if (null != factory.getUserDao().findByLogin(login)) {
			request.getSession().setAttribute("error", "User with this login does exist");
		} else {
			User user = new User(login, password);
			factory.getUserDao().save(user);
			request.getSession().setAttribute("user", user);
			page = "profile.jsp";
		}
		response.sendRedirect(page);
	}

}
