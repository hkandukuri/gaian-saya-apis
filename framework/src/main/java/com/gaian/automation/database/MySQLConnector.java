package com.gaian.automation.database;

import java.sql.*;

import org.apache.log4j.Logger;

public class MySQLConnector {

	Logger log = Logger.getLogger(MySQLConnector.class);

	public Connection MakeConnection(String hostname, String database, String username, String password) {
		String url = "jdbc:mysql://" + hostname + ":3306/" + database + "?user=" + username + "&password=" + password;
		return MakeConnection(url);
	}

	public Connection MakeConnection(String url) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
		} catch (ClassNotFoundException | SQLException e) {
			log.error("Unable to establish Database Connection, check the attributes passed.");
			log.error(e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}

	public ResultSet ExecuteQuery(String query, Connection connection) {
		ResultSet rs = null;
		try {
			Statement stmt = connection.createStatement();
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			log.error(String.format("Failed to execute the query - [%s] with Connection - [%s]", query,
					connection.toString()));
			log.error(e.getMessage());
			e.printStackTrace();
		}
		return rs;
	}
}
