package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MariaDBConnectionTest {
	private static final String DRIVER = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://localhost:3310/study";
	private static final String USER = "study";
	private static final String PW = "1234";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try {
			Connection con = DriverManager.getConnection(URL, USER, PW);
			System.out.println(con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
