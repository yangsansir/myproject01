package com.entities;

import java.io.Serializable;
import java.util.Date;
/*
 * 报修表
 */
@SuppressWarnings("serial")
public class Repair implements Serializable {
private Integer id;
private Date CreateTime;//创建时间
private String contact;//联系人
private RepairType repairType;//报修类型
private String RepairMessages;//报修信息
private String  telephone;//电话
private String status;//状态
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
