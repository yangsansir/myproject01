package com.entities;

import java.io.Serializable;

/*
 * 进货单身
 */
@SuppressWarnings("serial")
public class CarPayment implements Serializable{
private Integer id;
private String categoryName;//商品分类
private String  goodsName;//商品名
private  int number;//数量
private String status;//状态
private  CheckUser checkUser;//检验员
private CarHoldBill carHoldBill;//单头
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getGoodsName() {
	return goodsName;
}
public void setGoodsName(String goodsName) {
	this.goodsName = goodsName;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public CarHoldBill getCarHoldBill() {
	return carHoldBill;
}
public void setCarHoldBill(CarHoldBill carHoldBill) {
	this.carHoldBill = carHoldBill;
}
public CheckUser getCheckUser() {
	return checkUser;
}
public void setCheckUser(CheckUser checkUser) {
	this.checkUser = checkUser;
}


}
