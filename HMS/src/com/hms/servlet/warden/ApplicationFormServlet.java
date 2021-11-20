package com.hms.servlet.warden;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hms.model.ApplicationForm;

@WebServlet(urlPatterns = "/applicationFormServlet")
public class ApplicationFormServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String dob = req.getParameter("dob");
		String email = req.getParameter("email");
	
		String course = req.getParameter("course");
		String year = req.getParameter("year");
		String category = req.getParameter("category");
		

		String address = req.getParameter("address");
		String smobile = req.getParameter("smobile");
		String cAddress = req.getParameter("caddress");

		String fname = req.getParameter("fname");
		String fmobile = req.getParameter("fmobile");
		

		String localguardians = req.getParameter("localguardians");
		String lgname = req.getParameter("lgname");
		
		String photo = req.getParameter("photo");

		ApplicationForm applicationForm = new ApplicationForm();
		applicationForm.setName(name);
		applicationForm.setGender(gender);
		applicationForm.setDob(dob);
		applicationForm.setEmail(email);
		applicationForm.setCourse(course);
		applicationForm.setYear(year);
		applicationForm.setCategory(category);
		applicationForm.setAddress(address);
		applicationForm.setSmobile(smobile);
		applicationForm.setcAddress(cAddress);
		
		
		

		applicationForm.setFname(fname);
		applicationForm.setFmobile(fmobile);
		
		applicationForm.setLocalGuardians(localguardians);

		
		

		
		
		
		applicationForm.setLgname(lgname);

		applicationForm.setPhoto(photo);

		boolean isOK = com.hms.db.dao.ApplicationFormDAO.save(applicationForm);

		if (isOK) {
			resp.sendRedirect("/HMS/pages/warden/applicationForm.jsp?msg=Appliacation form Successfuly Submit!!!");
		} else {
			resp.sendRedirect("/HMS/pages/warden/applicationForm.jsp?msg=Registration Failed!!!");
		}

	}

}
