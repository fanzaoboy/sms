package com.sms.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	private static String url = "jdbc:mysql://localhost:3306/app?serverTimezone=GMT";
	private static String user = "root";
	private static String password = "root";

	//获取Connection对象
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL Driver Load Success!");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//有结果集的关闭
	public static void close(Connection conn,PreparedStatement ps,ResultSet res) {
		if(conn != null && ps != null && res != null) {
			try {
				conn.close();
				ps.close();
				res.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	//没有结果集的关闭
	public static void close(Connection conn,PreparedStatement ps) {
		if(conn != null && ps != null) {
			try {
				conn.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
}
