package com.sms.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sms.DAO.BrandInfoDAO;
import com.sms.Utils.DBUtil;
import com.sms.beans.BrandInfo;

public class BrandInfoDAOImpl implements BrandInfoDAO {

	@Override
	public List<BrandInfo> findAll() {
		Connection conn = DBUtil.getConn();
		String sql = "select * from dim_brand";
		PreparedStatement ps = null;
		ResultSet res = null;
		List<BrandInfo> brandList = new ArrayList<BrandInfo>();
		try {
			ps = conn.prepareStatement(sql);
			res = ps.executeQuery();

			if (res.next()) {
				BrandInfo brandInfo = new BrandInfo();
				brandInfo.setBrandId(res.getString(1));
				brandInfo.setSimpleBrandId(res.getString(2));
				brandInfo.setFirBrandName(res.getString(3));
				brandInfo.setSecBrandName(res.getString(4));
				brandInfo.setBrandTypeId(res.getString(5));
				brandInfo.setBrandDeptId(res.getString(6));
				brandList.add(brandInfo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, ps, res);
		}

		return brandList;
	}

}
