package com.service.impl;

import java.util.List;

import com.dao.TsaleDao;

import com.entities.Tsale;

import com.service.TsaleService;



public class TsaleServiceImpl implements TsaleService {
     private TsaleDao tsaleDao;
	@Override
	public void addtsale(Tsale tsale) {
		tsaleDao.addtsale(tsale);

	}

	@Override
	public List<Tsale> findAll(int currentPage, int pageSize) {
		List<Tsale>	tsalelist=	tsaleDao.findAll(currentPage, pageSize);
		return tsalelist;
	}

	@Override
	public void deletetsale(Tsale tsale) {
		tsaleDao.deletetsale(tsale);

	}

	@Override
	public Tsale findById(Integer id) {
		Tsale tsale=tsaleDao.findById(id);
		return tsale;
	}

	@Override
	public void updatetsale(Tsale tsale) {
		tsaleDao.updatetsale(tsale);
	}



	

	public TsaleDao gettsaleDao() {
		return tsaleDao;
	}

	public void settsaleDao(TsaleDao tsaleDao) {
		this.tsaleDao = tsaleDao;
	}

	@Override
	public int getTotle() {
		// TODO Auto-generated method stub
		return tsaleDao.getTotle();
	}

}
