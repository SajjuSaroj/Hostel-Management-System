package com.hms.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.hms.db.DbConnection;
import com.hms.model.ApplicationForm;
import com.hms.model.Warden;

public class ApplicationFormDAO {

	public static boolean save(ApplicationForm application) {

		try (Connection conn = DbConnection.getConnection()) {

			String sql = "INSERT INTO application_form "
					+ "(NAME ,GENDER, DOB, EMAIL, COURSE, YEAR,CATEGORY ,ADDRESS,SMOBILE,CADDRESS, FNAME,FMOBILE,LOCALGUARDIANS, LGNAME, PHOTO)"
					+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, application.getName());
			ps.setString(2, application.getGender());
			ps.setString(3, application.getDob());
			ps.setString(4, application.getEmail());
			ps.setString(5, application.getCourse());
			ps.setString(6, application.getYear());
			ps.setString(7, application.getCategory());
			ps.setString(8, application.getAddress());
			ps.setString(9, application.getSmobile());
			ps.setString(10, application.getcAddress());
			ps.setString(11, application.getFname());
			ps.setString(12, application.getFmobile());
			ps.setString(13, application.getLocalGuardians());
			ps.setString(14, application.getLgname());
			ps.setString(15, application.getPhoto());

			ps.executeUpdate();

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public static List<ApplicationForm> getallApplicationForms() {

		throw new UnsupportedOperationException("Not implemented yet");
	}

	private static final String ID = "id";
	private static final String NAME = "name";
	private static final String GENDER = "gender";
	private static final String DOB = "dob";
	private static final String EMAIL = "email";
	private static final String COURSE = "course";
	private static final String YEAR = "year";
	private static final String CATEGORY = "category";
	private static final String ADDRESS = "address";
	private static final String SMOBILE = "smobile";
	private static final String CADDRESS = "caddress";
	private static final String FNAME = "fname";

	private static final String FMOBILE = "fmobile";

	private static final String LOCALGUARDIANS = "localguardians";

	private static final String LGNAME = "lgname";

	private static final String PHOTO = "photo";

}
