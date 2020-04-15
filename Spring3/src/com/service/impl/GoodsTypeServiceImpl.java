package com.service.impl;

import java.util.List;

import com.dao.GoodsTypeDao;
import com.entities.GoodsType;
import com.service.GoodsTypeService;

public class GoodsTypeServiceImpl implements GoodsTypeService {
     private GoodsTypeDao goodsTypeDao;
	@Override
	public void add(List<GoodsType> goodsTypes) {
		goodsTypeDao.add(goodsTypes);

	}

	@Override
	public List<GoodsType> findAll(int currentPage, int pageSize) {
		List<GoodsType>  goodsTypelist=goodsTypeDao.findAll(currentPage, pageSize);
		return goodsTypelist;
	}

	@Override
	public void delete(GoodsType goodsType1) {
		goodsTypeDao.delete(goodsType1);

	}

	@Override
	public GoodsType findById(Integer id) {
		GoodsType goodsType1=goodsTypeDao.findById(id);
		return goodsType1;
	}

	@Override
	public void update(GoodsType goodsType1) {
		goodsTypeDao.update(goodsType1);

	}

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return goodsTypeDao.getTotle();
	}

	public GoodsTypeDao getGoodsTypeDao() {
		return goodsTypeDao;
	}

	public void setGoodsTypeDao(GoodsTypeDao goodsTypeDao) {
		this.goodsTypeDao = goodsTypeDao;
	}

}
