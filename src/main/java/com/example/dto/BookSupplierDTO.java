package com.example.dto;


public class BookSupplierDTO {
	private Long bkId;
	private String userName;
	private String password;
	private String supplierEmail;
	private String supplierName;
	private String supplierAddress;
	private Long supplierPhone;

	public BookSupplierDTO() {
		super();
	}

	public Long getBkId() {
		return bkId;
	}

	public void setBkId(Long bkId) {
		this.bkId = bkId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSupplierEmail() {
		return supplierEmail;
	}

	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public Long getSupplierPhone() {
		return supplierPhone;
	}

	public void setSupplierPhone(Long supplierPhone) {
		this.supplierPhone = supplierPhone;
	}
	
	
}
