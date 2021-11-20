package com.hms.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.hms.db.DbConnection;
import com.hms.model.Warden;

public class WardenDAO {

	public static boolean save(Warden warden) {

		try (Connection conn = DbConnection.getConnection()) {

			String sql = "INSERT INTO warden VALUES(?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, warden.getUserName());
			ps.setString(2, warden.getFirstName());
			ps.setString(3, warden.getLastName());
			ps.setString(4, warden.getEmail());
			ps.setString(5, warden.getPassword());
			ps.setString(6, warden.getPhone());
			ps.setString(7, warden.getDob());
			ps.setString(8, warden.getGender());
			ps.setString(9, warden.getAddress());
			ps.setString(10, warden.getPincode());

			ps.executeUpdate();

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

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

	public static Warden getWarden(String userName, String password) {

		Warden warden = null;

		try (Connection conn = DbConnection.getConnection()) {

			String sql = "SELECT * FROM warden WHERE username=? AND password=?";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, userName);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String email = rs.getString("email");
				String address = rs.getString("address");
				String phone = rs.getString("phone");
				String dob = rs.getString("dob");
				String gender = rs.getString("gender");
				String pincode = rs.getString("pincode");

				warden = new Warden(userName, firstName, lastName, email, password, address, phone, dob, gender,
						pincode);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return warden;

	}

	public static List<Warden> getAllWardens() {

		throw new UnsupportedOperationException("Not implemented yet");
	}

}
