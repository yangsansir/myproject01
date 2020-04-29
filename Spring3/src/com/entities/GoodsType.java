package com.entities;

import java.io.Serializable;

/*
 * 物品类别
 */
@SuppressWarnings("serial")
public class GoodsType implements Serializable {
	
	private  Integer id;
	private  String GoodsTypeName;//类别名称
	//private Set<GoodsCategory> goodsCategorySet=new HashSet<GoodsCategory>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoodsTypeName() {
		return GoodsTypeName;
	}
	public void setGoodsTypeName(String goodsTypeName) {
		GoodsTypeName = goodsTypeName;
	}
	

}
