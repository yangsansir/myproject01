package com.service.impl;

import java.util.List;

import com.dao.GoodsRepairDao;
import com.entities.GoodsRepair;
import com.service.GoodsRepairService;

public class GoodsRepairServiceImpl implements GoodsRepairService {
private GoodsRepairDao goodsRepairDao;
	@Override
	public void add(GoodsRepair goodsRepair) {
		goodsRepairDao.add(goodsRepair);

	}

	@Override
	public List<GoodsRepair> findAll(int currentPage, int pageSize) {
		List<GoodsRepair> goodsRepairlist=goodsRepairDao.findAll(currentPage, pageSize);
		return goodsRepairlist;
	}

	@Override
	public void delete(GoodsRepair goodsRepair) {
		goodsRepairDao.delete(goodsRepair);

	}

	@Override
	public GoodsRepair findById(Integer id) {
		GoodsRepair goodsRepair=goodsRepairDao.findById(id);
		return goodsRepair;
	}

	@Override
	public void update(GoodsRepair goodsRepair) {
		goodsRepairDao.update(goodsRepair);

	}

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return goodsRepairDao.getTotle();
	}

	public GoodsRepairDao getGoodsRepairDao() {
		return goodsRepairDao;
	}

	public void setGoodsRepairDao(GoodsRepairDao goodsRepairDao) {
		this.goodsRepairDao = goodsRepairDao;
	}

}
