package com.dao;

import java.util.List;

import com.entities.GoodsType;
public interface GoodsTypeDao {
	public void add(List<GoodsType> goodsTypes );
	public List<GoodsType> findAll(int currentPage,int pageSize);
	public void delete(GoodsType goodsType1 );
	public GoodsType findById(Integer id);
	public void update(GoodsType goodsType1 );
	public int getTotle();
}
