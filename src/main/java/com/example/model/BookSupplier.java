package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
public class BookSupplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bkId;
	
	@Column(unique = true)
	@NotNull
	@Max(10)
	private String userName;
	
	@Column (nullable = false)
	private String password;
	
	@Column(unique = true)
	private String supplierEmail;
	
	private String supplierName;
	private String supplierAddress;
	
	@Column(unique = true)
	private long supplierPhone;
	
//------------------------------------------------------------------------
	public BookSupplier() {
		super();
	}
//------------------------------------------------------------------------	
	
	public BookSupplier(String userName, String password, String supplierEmail,
		   String supplierName, String supplierAddress, long supplierPhone) {
		super();
		this.userName = userName;
		this.password = password;
		this.supplierEmail = supplierEmail;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
		this.supplierPhone = supplierPhone;
	}
//------------------------------------------------------------------------
	
	public long getBkId() {
		return bkId;
	}
	
	public void setBkId(long bkId) {
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
	
	public long getSupplierPhone() {
		return supplierPhone;
	}
	
	public void setSupplierPhone(long supplierPhone) {
		this.supplierPhone = supplierPhone;
	}
	
}
