package com.sms.beans;

public class UserInfo {

	private String userId;
	private String userName;
	private String userPasswd;
	private String stateId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPasswd() {
		return userPasswd;
	}

	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public UserInfo() {

	}

	public UserInfo(String userId, String userPasswd, String stateId) {
		super();
		this.userId = userId;
		this.userPasswd = userPasswd;
		this.stateId = stateId;
	}

	public UserInfo(String userId, String userPasswd) {
		super();
		this.userId = userId;
		this.userPasswd = userPasswd;
	}

	public UserInfo(String userId, String userName, String userPasswd, String stateId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPasswd = userPasswd;
		this.stateId = stateId;
	}
	
}
