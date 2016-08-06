package com.usm.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.usm.model.User;

public class UserService {
	
	public static void loadPage(HttpServletRequest request, HttpServletResponse response, String page) throws IOException {
		if (null != (User) request.getSession().getAttribute("user"))
			response.sendRedirect("profile.jsp");
		else
			response.sendRedirect(page);
	}
}

