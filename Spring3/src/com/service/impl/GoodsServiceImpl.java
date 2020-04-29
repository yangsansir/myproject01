package com.service.impl;

import java.util.List;

import com.dao.GoodsDao;
import com.entities.Goods;
import com.service.GoodsService;



public class GoodsServiceImpl implements GoodsService {
     private GoodsDao goodsDao;
	@Override
	public void addgoods(Goods goods) {
		goodsDao.addgoods(goods);

	}

	@Override
	public List<Goods> findAll(int currentPage, int pageSize) {
		List<Goods>	goodslist=	goodsDao.findAll(currentPage, pageSize);
		return goodslist;
	}

	@Override
	public void deletegoods(Goods goods) {
		goodsDao.deletegoods(goods);

	}

	@Override
	public Goods findById(Integer id) {
		Goods goods=goodsDao.findById(id);
		return goods;
	}

	@Override
	public void updategoods(Goods goods) {
		goodsDao.updategoods(goods);
	}


	public GoodsDao getGoodsDao() {
		return goodsDao;
	}

	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return goodsDao.getTotle();
	}

	@Override
	public List<Goods> query(int currentPage, int pageSize, String keyword) {
		List<Goods>	goodslist1=	goodsDao.query(currentPage, pageSize, keyword);
		return goodslist1;
	}

}
