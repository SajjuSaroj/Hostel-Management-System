package com.hms.servlet.warden;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hms.db.dao.RoomAllotmentDAO;
import com.hms.db.dao.WardenDAO;
import com.hms.model.ApplicationForm;
import com.hms.model.RoomAllotment;
import com.hms.model.Warden;

@WebServlet(urlPatterns = "/RoomAllotment")
public class RoomAllotmentServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=-1/*Integer.parseInt( req.getParameter("id"))*/;
		String cid = req.getParameter("cid");
		String eno= req.getParameter("eno");
		String sname = req.getParameter("sname");
		String courses = req.getParameter("courses");
		String year = req.getParameter("year");
		String hostel_type = req.getParameter("hostel_type");
		String hostel = req.getParameter("hostel");
		String roomno= req.getParameter("roomno");
		String category = req.getParameter("category");
		


		RoomAllotment roomAllotment = new RoomAllotment();
		roomAllotment.setId(id);
		roomAllotment.setCid(cid);
		roomAllotment.setEno(eno);
		roomAllotment.setSname(sname);
		roomAllotment.setCategory(category);
		
		roomAllotment.setCourses(courses);
		roomAllotment.setYear(year);
		
		roomAllotment.setHostel_type(hostel_type);
		roomAllotment.setHostel(hostel);
	
		roomAllotment.setRoomno(roomno);
		


		boolean isOK = RoomAllotmentDAO.save(roomAllotment);

		if (isOK) {
			resp.sendRedirect("/HMS/pages/warden/RoomAllotment.jsp?msg=Registration Successfull!!!");
		} else {
			resp.sendRedirect("/HMS/pages/warden/RoomAllotment.jsp?msg=Registration Failed!!!");
		}

	}

}
