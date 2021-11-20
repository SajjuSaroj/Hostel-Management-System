package com.hms.db.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.hms.db.DbConnection;
import com.hms.model.ApplicationForm;
import com.hms.model.RoomAllotment;
import com.hms.model.Warden;
public class RoomAllotmentDAO {
	
	
	
	public static boolean save(RoomAllotment roomallotment) {

		try (Connection conn = DbConnection.getConnection()) {

			String sql = "INSERT INTO room_allotment VALUES(?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, roomallotment.getId());
			ps.setString(2, roomallotment.getCid());
			ps.setString(3, roomallotment.getEno());
			ps.setString(4, roomallotment.getSname());
			ps.setString(5, roomallotment.getYear());
			ps.setString(6, roomallotment.getCourses());
			
			
			ps.setString(7, roomallotment.getHostel_type());
			ps.setString(8, roomallotment.getHostel());
			ps.setString(9, roomallotment.getRoomno());
		
			ps.setString(10, roomallotment.getCategory());
			ps.executeUpdate();

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	
	
	
	

	private static final String ID = "id";
	private static final String CID = "cid";
	private static final String ENO = "eno";
	private static final String SNAME = "sname";
	
	private static final String COURSE = "course";
	private static final String YEAR = "year";
	private static final String HOSTEL_TYPE = "hostel_type";
	private static final String HOSTEL = "hostel";
	private static final String ROOMNO = "roomno";
	
	private static final String CATEGORY = "category";


	

}


