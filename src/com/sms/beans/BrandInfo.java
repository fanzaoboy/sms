package com.sms.beans;

public class BrandInfo {

	private String brandId;
	private String simpleBrandId;
	private String firBrandName;
	private String secBrandName;
	private String brandTypeId;
	private String brandDeptId;

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getSimpleBrandId() {
		return simpleBrandId;
	}

	public void setSimpleBrandId(String simpleBrandId) {
		this.simpleBrandId = simpleBrandId;
	}

	public String getFirBrandName() {
		return firBrandName;
	}

	public void setFirBrandName(String firBrandName) {
		this.firBrandName = firBrandName;
	}

	public String getSecBrandName() {
		return secBrandName;
	}

	public void setSecBrandName(String secBrandName) {
		this.secBrandName = secBrandName;
	}

	public String getBrandTypeId() {
		return brandTypeId;
	}

	public void setBrandTypeId(String brandTypeId) {
		this.brandTypeId = brandTypeId;
	}

	public String getBrandDeptId() {
		return brandDeptId;
	}

	public void setBrandDeptId(String brandDeptId) {
		this.brandDeptId = brandDeptId;
	}

	public BrandInfo(String brandId, String simpleBrandId, String firBrandName, String secBrandName, String brandTypeId,
			String brandDeptId) {
		super();
		this.brandId = brandId;
		this.simpleBrandId = simpleBrandId;
		this.firBrandName = firBrandName;
		this.secBrandName = secBrandName;
		this.brandTypeId = brandTypeId;
		this.brandDeptId = brandDeptId;
	}

	public BrandInfo() {
		super();
	}

	public BrandInfo(String brandId, String secBrandName) {
		super();
		this.brandId = brandId;
		this.secBrandName = secBrandName;
	}

}
