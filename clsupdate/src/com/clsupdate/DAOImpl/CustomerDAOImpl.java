package com.clsupdate.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.clsupdate.DAO.CustomerDAO;
import com.clsupdate.DBUtil.DBUtil;

public class CustomerDAOImpl implements CustomerDAO{

	/**
	 * 根据客户ID修改客户手机号
	 */
	@Override
	public void UpdateMobile(String id, String mobile) {
		
		String sql = "update ci_cust_base set mobile = ? where id = ?";
		Connection conn = DBUtil.getConn();
		PreparedStatement ps = null;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, mobile);
			ps.setString(2, id);
			
			ps.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
