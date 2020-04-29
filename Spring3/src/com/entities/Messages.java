package com.entities;

import java.io.Serializable;
import java.util.Date;
/*
 * 留言表
 */
@SuppressWarnings("serial")
public class Messages implements Serializable{
private Integer id;
private Date CreateTime;//创建时间
private String email;//邮箱
private String contact;//联系人
private String  telephone;//电话
private String Messages;//留言信息
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Date getCreateTime() {
	return CreateTime;
}
public void setCreateTime(Date createTime) {
	CreateTime = createTime;
}


public String getMessages() {
	return Messages;
}
public void setMessages(String messages) {
	Messages = messages;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}

}
