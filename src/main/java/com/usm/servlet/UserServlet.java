package com.usm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.usm.config.Factory;
import com.usm.model.User;

@WebServlet(name = "UserServlet", urlPatterns = "/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		String page = "error.jsp";
		if (login.isEmpty() || password.isEmpty())
			page = "error.jsp";
		
		Factory factory = Factory.getInstance();
		User user = factory.getUserDao().findByLogin(login);
		
		if (null != user && user.getPassword().equals(password)) {
			request.getSession().setAttribute("user", user);
			page = "success.jsp";
		}
		response.sendRedirect(page);
	}

}
