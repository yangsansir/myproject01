package com.entities;

import java.io.Serializable;
import java.util.Date;
/*
 * ���ޱ�
 */
@SuppressWarnings("serial")
public class Repair implements Serializable {
private Integer id;
private Date CreateTime;//����ʱ��
private String contact;//��ϵ��
private RepairType repairType;//��������
private String RepairMessages;//������Ϣ
private String  telephone;//�绰
private String status;//״̬
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
public RepairType getRepairType() {
	return repairType;
}
public void setRepairType(RepairType repairType) {
	this.repairType = repairType;
}
public String getRepairMessages() {
	return RepairMessages;
}
public void setRepairMessages(String repairMessages) {
	RepairMessages = repairMessages;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}


}
