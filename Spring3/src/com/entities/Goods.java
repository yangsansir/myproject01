package com.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
 商品数据表
 */

public class Goods implements Serializable {

	/**
	 * @author yang
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	
	private String goodsName;// 商品名称
	private String goodsNickName;// 商品别称

	private String producer;// 生产商
	private String salePrice;// 售价
	private String productDate;// 生产日期
	private String endDate;// 保质截止期
	private GoodsCategory goodsCategory;// 商品分类
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsNickName() {
		return goodsNickName;
	}
	public void setGoodsNickName(String goodsNickName) {
		this.goodsNickName = goodsNickName;
	}
	
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}
	public String getProductDate() {
		return productDate;
	}
	public void setProductDate(String productDate) {
		this.productDate = productDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public GoodsCategory getGoodsCategory() {
		return goodsCategory;
	}
	public void setGoodsCategory(GoodsCategory goodsCategory) {
		this.goodsCategory = goodsCategory;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
