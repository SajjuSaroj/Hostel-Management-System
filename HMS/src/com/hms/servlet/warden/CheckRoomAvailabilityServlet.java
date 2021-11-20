package com.hms.servlet.warden;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hms.db.dao.HostelDAO;

@WebServlet(urlPatterns = "/checkRoomAvailabilityServlet")
public class CheckRoomAvailabilityServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int hostelId = Integer.parseInt(req.getParameter("name"));
		String type = req.getParameter("type");

		String roomNum = req.getParameter("roomNum");
		String category = req.getParameter("category");

		String status = HostelDAO.getRoomStatus(type, hostelId, category, roomNum);

		HttpSession session = req.getSession(false);

		if (session != null) {
			session.setAttribute("status", status);
		}

		resp.sendRedirect("/HMS/pages/warden/roomAllocation.jsp");

		// req.getRequestDispatcher("/pages/warden/roomAllocation.jsp").forward(req,
		// resp);

	}

}
