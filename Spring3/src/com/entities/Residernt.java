package com.entities;

import java.io.Serializable;
/*
 * 
 * 住户表
 */
@SuppressWarnings("serial")
public class Residernt implements Serializable {
    private Integer id;
    private String LoginName;//登录名
    private String Password;//密码
    private String RealName;//户主姓名
    private MiddleFloor middleFloor;//楼栋
    private String RoomNumber;//房号
    private String Telephone;//联系方式
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
	
	public MiddleFloor getMiddleFloor() {
		return middleFloor;
	}
	public void setMiddleFloor(MiddleFloor middleFloor) {
		this.middleFloor = middleFloor;
	}
	public String getRoomNumber() {
		return RoomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		RoomNumber = roomNumber;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
   
}
 