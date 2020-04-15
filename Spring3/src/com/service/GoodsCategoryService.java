package com.service;

import java.util.List;

import com.entities.GoodsCategory;

public interface GoodsCategoryService {
	public void add(GoodsCategory  goodsCategory);
	public List<GoodsCategory> findAll(int currentPage,int pageSize);
	public void delete(GoodsCategory goodsCategory );
	public GoodsCategory findById(Integer id);
	public void update(GoodsCategory goodsCategory );
	public int getTotle();
}
