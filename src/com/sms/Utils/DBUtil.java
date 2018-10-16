package com.sms.Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	private static String url = "jdbc:mysql://localhost:3306/app?serverTimezone=GMT";
	private static String user = "root";
	private static String password = "root";

	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL Driver Load Success!");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}
}
