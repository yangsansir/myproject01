package com.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * 供应商
*/

@SuppressWarnings("serial")
public class Supplier implements Serializable{

private Integer id;
private String supplierName;//供应商名称
private String supplierZone;//地区
private String campanyPhone;//电话
private String linkMan;//联系人
private String mobilePhone;//手机号
private String address;//地址
private String email;//邮箱
private String remark;//备注

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}
public String getSupplierZone() {
	return supplierZone;
}
public void setSupplierZone(String supplierZone) {
	this.supplierZone = supplierZone;
}
public String getCampanyPhone() {
	return campanyPhone;
}
public void setCampanyPhone(String campanyPhone) {
	this.campanyPhone = campanyPhone;
}
public String getLinkMan() {
	return linkMan;
}
public void setLinkMan(String linkMan) {
	this.linkMan = linkMan;
}
public String getMobilePhone() {
	return mobilePhone;
}
public void setMobilePhone(String mobilePhone) {
	this.mobilePhone = mobilePhone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}


}
