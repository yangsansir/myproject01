package com.entities;

import java.util.HashSet;
import java.util.Set;

/*
 * 
 */
public class GoodsCategory {
	private Integer id;
	private String categoryName;//商品类别
	private String categoryDescription;//商品描述
    private Set<Goods> goods=new HashSet<Goods>();
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
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public Set<Goods> getGoods() {
		return goods;
	}
	public void setGoods(Set<Goods> goods) {
		this.goods = goods;
	}
    
}
