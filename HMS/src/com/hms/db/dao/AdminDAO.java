package com.hms.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.hms.db.DbConnection;
import com.hms.model.Admin;
import com.hms.model.Warden;

public class AdminDAO {

	public static boolean save(Admin admin) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	public static boolean edit(Warden warden) {

		throw new UnsupportedOperationException("Not implemented yet");
	}

	public static boolean delete(String email) {

		throw new UnsupportedOperationException("Not implemented yet");
	}

	public static Warden getWarden(String email) {

		throw new UnsupportedOperationException("Not implemented yet");
	}

	public static Admin getAdmin(String userName, String password) {

		Admin admin = null;

		try (Connection conn = DbConnection.getConnection()) {

			String sql = "SELECT * FROM admin WHERE username=? AND password=?";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, userName);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				String email = rs.getString("email");
				int id = rs.getInt("id");

				admin = new Admin(id, userName, email, password);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return admin;

	}

	public static List<Warden> getAllWardens() {

		throw new UnsupportedOperationException("Not implemented yet");
	}

}
