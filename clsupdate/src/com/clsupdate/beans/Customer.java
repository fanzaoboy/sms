package com.clsupdate.beans;

public class Customer {

	private String id;
	private String cust_code;
	private String cust_name;
	private String cert_type_id;
	private String cert_no;
	private String cust_type_id;
	private String mobile;
	private String message_addr;
	private String province_id;
	private String city_id;
	private String contry_id;
	private String cust_stat_id;
	private String version_no;
	private String mdm_code;
	private String is_new_id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCust_code() {
		return cust_code;
	}

	public void setCust_code(String cust_code) {
		this.cust_code = cust_code;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCert_type_id() {
		return cert_type_id;
	}

	public void setCert_type_id(String cert_type_id) {
		this.cert_type_id = cert_type_id;
	}

	public String getCert_no() {
		return cert_no;
	}

	public void setCert_no(String cert_no) {
		this.cert_no = cert_no;
	}

	public String getCust_type_id() {
		return cust_type_id;
	}

	public void setCust_type_id(String cust_type_id) {
		this.cust_type_id = cust_type_id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMessage_addr() {
		return message_addr;
	}

	public void setMessage_addr(String message_addr) {
		this.message_addr = message_addr;
	}

	public String getProvince_id() {
		return province_id;
	}

	public void setProvince_id(String province_id) {
		this.province_id = province_id;
	}

	public String getCity_id() {
		return city_id;
	}

	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}

	public String getContry_id() {
		return contry_id;
	}

	public void setContry_id(String contry_id) {
		this.contry_id = contry_id;
	}

	public String getCust_stat_id() {
		return cust_stat_id;
	}

	public void setCust_stat_id(String cust_stat_id) {
		this.cust_stat_id = cust_stat_id;
	}

	public String getVersion_no() {
		return version_no;
	}

	public void setVersion_no(String version_no) {
		this.version_no = version_no;
	}

	public String getMdm_code() {
		return mdm_code;
	}

	public void setMdm_code(String mdm_code) {
		this.mdm_code = mdm_code;
	}

	public String getIs_new_id() {
		return is_new_id;
	}

	public void setIs_new_id(String is_new_id) {
		this.is_new_id = is_new_id;
	}

	public Customer(String id, String mobile) {
		super();
		this.id = id;
		this.mobile = mobile;
	}

	public Customer() {
		super();
	}

}
