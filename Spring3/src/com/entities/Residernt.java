package com.entities;

import java.io.Serializable;
/*
 * 
 * ס����
 */
@SuppressWarnings("serial")
public class Residernt implements Serializable {
    private Integer id;
    private String LoginName;//��¼��
    private String Password;//����
    private String RealName;//��������
    private MiddleFloor middleFloor;//¥��
    private String RoomNumber;//����
    private String Telephone;//��ϵ��ʽ
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
 