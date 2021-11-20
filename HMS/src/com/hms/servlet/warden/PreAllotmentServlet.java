package com.hms.servlet.warden;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hms.db.dao.Pre_AllotmentDAO;
import com.hms.model.PreAllotment;

@WebServlet(urlPatterns = "/PreAllotmentWarden")
public class PreAllotmentServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		int cid =Integer.parseInt(req.getParameter("cid"));
		String enroll = req.getParameter("enroll");
		String sname = req.getParameter("sname");
		
		String course = req.getParameter("course");
		
		String year = req.getParameter("year");
		String email = req.getParameter("email");
		String receipt= req.getParameter("receipt");
		
		
		PreAllotment preAllotment=  new PreAllotment();
				
		
			
			preAllotment.setCid(cid);
			preAllotment.setEnroll(enroll);
			
			preAllotment.setSname(sname);
			preAllotment.setCourse(course);
			preAllotment.setYear(year);
			preAllotment.setYear(year);
			preAllotment.setEmail(email);
			preAllotment.setReceipt(receipt);
			
			
			boolean isOK = Pre_AllotmentDAO.save(preAllotment);

			if (isOK) {
				resp.sendRedirect("/HMS/pages/warden/preAllotmentForm.jsp?msg=Appliacation form Successfuly Submit!!!");
			} else {
				resp.sendRedirect("/HMS/pages/warden/preAllotmentForm.jsp?msg=Registration Failed!!!");
			}
			

	}
}
