package com.hms.db.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.hms.db.DbConnection;
import com.hms.model.ApplicationForm;
import com.hms.model.PreAllotment;
import com.hms.model.Warden;

public class Pre_AllotmentDAO {


	public static boolean save(PreAllotment preallotment) {

		try (Connection conn = DbConnection.getConnection()) {
			String sql1  ="INSERT INTO fee_verification VALUES(?,?,?,?,?,?,?)";

			PreparedStatement ps = conn.prepareStatement(sql1);

			ps.setInt(1, preallotment.getCid());
			ps.setString(2, preallotment.getEnroll());
			ps.setString(3, preallotment.getSname());
			ps.setString(4, preallotment.getCourse());
			ps.setString(5, preallotment.getYear());
			ps.setString(6, preallotment.getEmail());
			ps.setString(7, preallotment.getReceipt());
			

			ps.executeUpdate();

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public static List<PreAllotment> getallPreAllotments() {

		throw new UnsupportedOperationException("Not implemented yet");
	}

	private static final String CID = "cid";
	private static final String ENROLL = "enroll";
	private  static final String SNAME = "sname";
	private static final String COURSE = "course";
	private static final String YEAR = "year";
	private static final String EMAIL = "email";
	private static final String RECEIPT = "receipt";
	

}
