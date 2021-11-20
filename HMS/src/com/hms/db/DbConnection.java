package com.hms.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getConnection() {

		try {
			Class.forName("org.mariadb.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/hms", "root", "root");
			return connection;

		}
		catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();

			return null;
		}

	}

}