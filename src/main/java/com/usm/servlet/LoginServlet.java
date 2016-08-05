package com.usm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.usm.config.Factory;
import com.usm.model.User;

@WebServlet
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (null != (User) request.getSession().getAttribute("user"))
			response.sendRedirect("profile.jsp");
		else
			response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost");
		String login = request.getParameter("login");
		String password = request.getParameter("password");

		String page = "login.jsp";
		if (login.isEmpty() || password.isEmpty())
			page = "login.jsp";

		Factory factory = Factory.getInstance();
		User user = factory.getUserDao().findByLogin(login);

		if (null != user && user.getPassword().equals(password)) {
			request.getSession().setAttribute("user", user);
			page = "profile.jsp";
		}
		response.sendRedirect(page);
	}

}
