package com.entities;

import java.io.Serializable;

/*
 * ��Ʒ���
 */
@SuppressWarnings("serial")
public class GoodsType implements Serializable {
	
	private  Integer id;
	private  String GoodsTypeName;//�������
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
