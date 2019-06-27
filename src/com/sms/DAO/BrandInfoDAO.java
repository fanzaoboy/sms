package com.sms.DAO;

import java.util.List;

import com.sms.beans.BrandInfo;

public interface BrandInfoDAO {

	/***
	 * 
	 * @return 返回所有产品信息
	 * @author hd
	 */
	public List<BrandInfo> findAll();
}
