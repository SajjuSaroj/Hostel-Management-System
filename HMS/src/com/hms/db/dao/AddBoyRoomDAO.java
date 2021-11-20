package com.hms.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.hms.db.DbConnection;
import com.hms.model.AddBoyRoom;
import com.hms.model.ApplicationForm;
import com.hms.model.Warden;

public class AddBoyRoomDAO {

	public static boolean save(AddBoyRoom addboyroom) {

		try (Connection conn = DbConnection.getConnection()) {

			String sql  ="INSERT INTO boyroom VALUES(?,?,?)";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, addboyroom.getHostel());
			ps.setString(2, addboyroom.getRoomno());
		
			
			ps.setString(3, addboyroom.getCategory());
			

			ps.executeUpdate();

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	
	

	public static List<AddBoyRoomDAO> getallAddBoyRoom() {

		throw new UnsupportedOperationException("Not implemented yet");
	}


	private static final String HOSTEL= "hostel";
	private static final String ROOMNO = "roomno";

	private static final String CATEGORY = "category";
	
}
