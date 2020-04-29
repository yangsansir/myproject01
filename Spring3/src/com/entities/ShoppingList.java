package com.entities;

import java.io.Serializable;

/*
 * 购物单
 */

@SuppressWarnings("serial")
public class ShoppingList  implements Serializable{
	private Integer id;
	private String GoodsName;
    private  String  goodsType;
    private double price;//价格
    private  int  number;//数量
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoodsName() {
		return GoodsName;
	}
	public void setGoodsName(String goodsName) {
		GoodsName = goodsName;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}
