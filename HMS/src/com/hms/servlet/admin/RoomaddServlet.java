package com.hms.servlet.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hms.db.dao.HostelDAO;

@WebServlet(urlPatterns = "/roomaddServlet")
public class RoomaddServlet extends HttpServlet {

	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	
;
		int hostelId =Integer.parseInt( req.getParameter("name"));
		String type = req.getParameter("type");

		String roomNum = req.getParameter("roomNum");
		String category = req.getParameter("category");

		

		req.getRequestDispatcher("/HMS/pages/admin/RoomAdd.jsp").forward(req, resp);

	}

}
