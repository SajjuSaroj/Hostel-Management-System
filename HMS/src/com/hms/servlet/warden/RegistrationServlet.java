package com.hms.servlet.warden;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hms.db.dao.WardenDAO;
import com.hms.model.Warden;

@WebServlet(urlPatterns = "/wardenRegister")
public class RegistrationServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String userName = req.getParameter("userName");
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String address = req.getParameter("address");
		String phone = req.getParameter("phone");
		String dob = req.getParameter("dob");
		String gender = req.getParameter("gender");
		String pincode = req.getParameter("pincode");

		Warden warden = new Warden(userName, firstName, lastName, email, password, address, phone, dob, gender,
				pincode);

		boolean isOK = WardenDAO.save(warden);

		if (isOK) {
			resp.sendRedirect("/HMS/index.jsp?msg=Registration Successfull!!!");
		} else {
			resp.sendRedirect("/HMS/warden/registration.jsp?msg=Registration Failed!!!");
		}

	}

}
