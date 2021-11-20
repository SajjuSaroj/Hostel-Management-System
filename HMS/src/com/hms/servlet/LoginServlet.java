package com.hms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hms.db.dao.AdminDAO;
import com.hms.db.dao.WardenDAO;
import com.hms.model.Admin;
import com.hms.model.Warden;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		String loginType = req.getParameter("loginType");

		if ("Warden".equalsIgnoreCase(loginType)) {
			Warden warden = WardenDAO.getWarden(userName, password);

			if (warden == null) {
				resp.sendRedirect("/HMS/index.jsp?msg=Invalid username or password.");
			} else {

				HttpSession session = req.getSession(true);

				session.setAttribute("user", warden);

				resp.sendRedirect("/HMS/pages/warden/home.jsp");
			}

		} else if ("Admin".equalsIgnoreCase(loginType)) {

			Admin admin = AdminDAO.getAdmin(userName, password);

			if (admin == null) {
				resp.sendRedirect("/HMS/index.jsp?msg=Invalid username or password.");
			} else {

				HttpSession session = req.getSession(true);

				session.setAttribute("user", admin);

				resp.sendRedirect("/HMS/pages/admin/home.jsp");
			}

		
		}

		
	}

}
