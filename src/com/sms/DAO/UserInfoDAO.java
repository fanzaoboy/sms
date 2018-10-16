package com.sms.DAO;

public interface UserInfoDAO {

	/**
	 * @author hd
	 * @desc user login
	 */
	
	public boolean userLogin(String userId,String password);
	
	/**
	 * @author hd
	 * @desc user insert
	 */
	
	public void userAdd(String userName,String password);
	
	/**
	 * @author hd
	 * @desc user update password
	 */
	
	public void userUpdatePasswd(String userId,String newPassword);
	
	/**
	 * @author hd
	 * @desc user update state
	 */
	
	public void userUpdateState(String userId,String stateId);
	
}
