package com.entities;

import java.io.Serializable;
/*
 * 
 * Ա����
 */
@SuppressWarnings("serial")
public class Employee implements Serializable{
private Integer id;
private String  LoginName;
private String Password;
private  String RealName;
private  String  Sex;//�Ա�
private String   Contact;//��ϵ��ʽ
private String  remarks;//��ע
private  Role role;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getLoginName() {
	return LoginName;
}
public void setLoginName(String loginName) {
	LoginName = loginName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getRealName() {
	return RealName;
}
public void setRealName(String realName) {
	RealName = realName;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}
public String getSex() {
	return Sex;
}
public void setSex(String sex) {
	Sex = sex;
}
public String getContact() {
	return Contact;
}
public void setContact(String contact) {
	Contact = contact;
}

}
