package com.sms.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sms.DAO.UserInfoDAO;
import com.sms.Utils.DBUtil;
import com.sms.Utils.IDUtil;

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
			if(res.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
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

}
