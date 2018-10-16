package com.clsupdate.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	private static String driveClassName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://10.102.230.8:3306/uat_cls?useUnicode=true&characterEncoding=utf8";

	/***
	 * @author hd
	 * @return 返回一个JDBC连接对象
	 */
	public static Connection getConn() {

		Connection conn = null;
		try {
			Class.forName(driveClassName);
			conn = DriverManager.getConnection(url, "root", "Mysql@123");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}

	public static void close(PreparedStatement ps, ResultSet res, Connection conn) {
		if (ps != null && res != null && conn != null) {
			try {
				ps.close();
				res.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
