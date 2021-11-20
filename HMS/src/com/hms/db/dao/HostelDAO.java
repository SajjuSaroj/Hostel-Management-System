package com.hms.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hms.db.DbConnection;
import com.hms.model.Hostel;
import com.hms.model.Warden;

public class HostelDAO {

	public static boolean save(Hostel hostel) {

		throw new UnsupportedOperationException("Not implemented yet");
	}

	public static boolean edit(Hostel hostel) {

		throw new UnsupportedOperationException("Not implemented yet");
	}

	public static boolean delete(String email) {

		throw new UnsupportedOperationException("Not implemented yet");
	}

	public static List<Hostel> getAllHostels() {

		List<Hostel> hostels = new ArrayList<Hostel>();

		try (Connection conn = DbConnection.getConnection()) {

			String sql = "SELECT * FROM hostel";

			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int id = rs.getInt("id");

				String name = rs.getString("name");
				String roomNum = rs.getString("room_num");
				String category = rs.getString("category");
				String status = rs.getString("status");
				String type = rs.getString("type");

				Hostel hostel = new Hostel(id, name, roomNum, category, status, type);

				hostels.add(hostel);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return hostels;

	}

	public static String getRoomStatus(String type, int hostelId, String category, String room_num)

	{

		try (Connection conn = DbConnection.getConnection()) {

			String sql = "SELECT status FROM hostel WHERE id=?  AND category=? AND room_num=?";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, hostelId);
			
			ps.setString(2, category);
			ps.setString(3, room_num);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				String status = rs.getString("status");

				return status;
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return "occupied";
	}
}
