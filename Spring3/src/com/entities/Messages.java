package com.entities;

import java.io.Serializable;
import java.util.Date;
/*
 * ���Ա�
 */
@SuppressWarnings("serial")
public class Messages implements Serializable{
private Integer id;
private Date CreateTime;//����ʱ��
private String email;//����
private String contact;//��ϵ��
private String  telephone;//�绰
private String Messages;//������Ϣ
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
