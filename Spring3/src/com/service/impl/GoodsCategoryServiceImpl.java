package com.service.impl;

import java.util.List;

import com.dao.GoodsCategoryDao;
import com.entities.GoodsCategory;
import com.service.GoodsCategoryService;

public class GoodsCategoryServiceImpl implements GoodsCategoryService {
private GoodsCategoryDao goodsCategoryDao;
	@Override
	public void add(GoodsCategory goodsCategory) {
		goodsCategoryDao.add(goodsCategory);

	}

	@Override
	public List<GoodsCategory> findAll(int currentPage, int pageSize) {
		List<GoodsCategory> goodsCategorylist= goodsCategoryDao.findAll(currentPage, pageSize);
		return goodsCategorylist;
	}

	@Override
	public void delete(GoodsCategory goodsCategory) {
		goodsCategoryDao.delete(goodsCategory);

	}

	@Override
	public GoodsCategory findById(Integer id) {
		GoodsCategory goodsCategory=goodsCategoryDao.findById(id);
		return goodsCategory;
	}

	@Override
	public void update(GoodsCategory goodsCategory) {
		goodsCategoryDao.update(goodsCategory);

	}

	@Override
	public int getTotle() {
	
		return goodsCategoryDao.getTotle();
	}

	public GoodsCategoryDao getGoodsCategoryDao() {
		return goodsCategoryDao;
	}

	public void setGoodsCategoryDao(GoodsCategoryDao goodsCategoryDao) {
		this.goodsCategoryDao = goodsCategoryDao;
	}

	

}
