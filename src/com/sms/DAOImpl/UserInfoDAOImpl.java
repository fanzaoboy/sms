package com.sms.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.sms.DAO.UserInfoDAO;
import com.sms.Utils.DBUtil;
import com.sms.Utils.IDUtil;
import com.sms.beans.UserInfo;

public class UserInfoDAOImpl implements UserInfoDAO {

	@Override
	public boolean userLogin(String userId, String password) {

		if (userId == null || userId.equals("") || password == null || password.equals("")) {
			return false;
		}

		Connection conn = DBUtil.getConn();
		String sql = "select * from authuser where userId = ? and userPasswd = ?";
		PreparedStatement ps = null;
		ResultSet res = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			res = ps.executeQuery();
			if (res.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, ps, res);
		}

		return false;

	}

	@Override
	public void userAdd(String userName, String password) {

		if (userName == null || userName.equals("") || password == null || password.equals("")) {
			System.out.println("用户名或密码不能为空");
		}
		String userId = IDUtil.RandomNum();
		String sql = "insert into authuser values (?,?,?,?)";

		Connection conn = DBUtil.getConn();
		PreparedStatement ps = null;

		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, userName);
			ps.setString(3, password);
			ps.setString(4, "1");

			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, ps);
		}

	}

	@Override
	public void userUpdatePasswd(String userId, String newPassword) {
		// TODO Auto-generated method stub

	}

	@Override
	public void userUpdateState(String userId, String stateId) {
		// TODO Auto-generated method stub

	}

	@Override
	public String findUserNameById(String userId) {
		if (userId == null || userId.equals("")) {
			System.err.println("用户Id不能为空");
		}

		String sql = "select username from authuser where userid = ?";

		Connection conn = DBUtil.getConn();
		PreparedStatement ps = null;
		ResultSet res = null;
		String userName = null;

		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, userId);

			res = ps.executeQuery();
			while (res.next()) {
				userName = res.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, ps, res);
		}
		return userName;
	}

	@Override
	public List<UserInfo> findAll() {
		Connection conn = DBUtil.getConn();
		String sql = "select userid,username,stateid from authuser";
		PreparedStatement ps = null;
		ResultSet res = null;
		List<UserInfo> userList = new ArrayList<UserInfo>();
		try {
			ps = conn.prepareStatement(sql);
			res = ps.executeQuery();
			while(res.next()) {
				String userId = res.getString(1);
				String userName = res.getString(2);
				String stateId = res.getString(3);
				UserInfo ui = new UserInfo(userId, userName, stateId);
				userList.add(ui);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, ps, res);
		}
		
		return userList;
	}

}
